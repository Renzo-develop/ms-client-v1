package com.rec.msclient.service;

import com.rec.msclient.entity.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {

    public Flux<Client> findAll();

    public Mono<Client> findById(Long id);

    public Mono<Client> findByDni(String id);

    public Mono<Client> createClient(Client client);

    public Mono<Client> updateClient(Client client);

    public Mono<Void> deleteClient(Long id);
}
