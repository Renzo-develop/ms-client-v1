package com.rec.msclient.service.impl;

import com.rec.msclient.entity.Client;
import com.rec.msclient.repository.ClientRepository;
import com.rec.msclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepo;

    public Flux<Client> findAll() {
        return clientRepo.findAll();
    }

    public Mono<Client> findById(Long id) {
        return clientRepo.findById(id);
    }

    public Mono<Client> createClient(Client client) {
        return clientRepo.insert(client);
    }

    public Mono<Client> updateClient(Client client) {
        return clientRepo.insert(client);
    }

    public Mono<Void> deleteClient(Long id) {
        return clientRepo.deleteById(id);
    }

}
