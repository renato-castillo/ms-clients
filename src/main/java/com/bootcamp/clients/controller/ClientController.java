package com.bootcamp.clients.controller;

import com.bootcamp.clients.entity.Client;
import com.bootcamp.clients.resource.ClientResource;
import com.bootcamp.clients.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientResource clientResource;

    @PostMapping("prueba")
    private Mono<Client> save(@RequestBody Client client) {
        return clientResource.create(client);
    }
}
