package com.bootcamp.clients.resource;

import com.bootcamp.clients.entity.Client;
import com.bootcamp.clients.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ClientResource {

    @Autowired
    private IClientService clientService;

    public Mono<Client> create(Client client) {
        return clientService.save(client);
    }
}
