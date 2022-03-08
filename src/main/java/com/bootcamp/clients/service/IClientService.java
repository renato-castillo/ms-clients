package com.bootcamp.clients.service;

import com.bootcamp.clients.entity.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientService {

    Flux<Client> findAll();

    Mono<Client> save(Client client);

}
