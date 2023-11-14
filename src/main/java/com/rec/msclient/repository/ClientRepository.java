package com.rec.msclient.repository;

import com.rec.msclient.entity.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, Long> {

    Mono<Client> findByDni(String dni);
}
