package com.rec.msclient.controller;

import com.rec.msclient.entity.Client;
import com.rec.msclient.entity.CustomException;
import com.rec.msclient.entity.ResponseApi;
import com.rec.msclient.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public Flux<Client> getClients() {
        return clientService.findAll();
    }

    @GetMapping("/find/{id}")
    public Mono<Client> findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @GetMapping("/findByDni/{dni}")
    public Mono<Client> findByDni(@PathVariable String dni) {
        return clientService.findByDni(dni);
    }

    @PostMapping("/create")
    public Mono<ResponseApi> create(@Validated @RequestBody Client client) {
        return clientService.createClient(client)
                .map(r -> ResponseApi.builder().message("Client " + r.getName() + " created").build())
                .doOnSuccess(r -> log.info("Successful {}", r.getMessage()))
                .doOnError(ex -> log.error("Error Produced {}", ex.toString()));
    }

    @PutMapping("/update")
    public Mono<Client> update(@RequestBody Client client) {
        return clientService.findById(client.getClientId())
                .flatMap(old -> clientService.updateClient(client))
                .switchIfEmpty(Mono.empty());
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return clientService.deleteClient(id);
    }
}
