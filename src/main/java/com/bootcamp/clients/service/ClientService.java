package com.bootcamp.clients.service;

import com.bootcamp.clients.entity.Client;
import com.bootcamp.clients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Flux<Client> findAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Mono<Client> save(Client client) {
        return this.clientRepository.save(client);
    }
}
