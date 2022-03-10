package com.bootcamp.clients.service;

import com.bootcamp.clients.entity.Client;
import com.bootcamp.clients.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class ClientService implements IClientService {

    @Autowired
    private IClientRepository IClientRepository;

    @Override
    public Flux<Client> findAll() {
        return this.IClientRepository.findAll();
    }

    @Override
    public Mono<Client> save(Client client) {

        if(client.getId() != null) {
            client.setUpdatedAt(LocalDateTime.now());
        } else {
            client.setCreatedAt(LocalDateTime.now());
        }

        return this.IClientRepository.save(client);
    }

    @Override
    public Mono<Client> findById(String id) {
        return this.IClientRepository.findById(id);
    }
}
