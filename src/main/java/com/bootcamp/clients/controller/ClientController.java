package com.bootcamp.clients.controller;

import com.bootcamp.clients.entity.Client;
import com.bootcamp.clients.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping("prueba")
    private Mono<Client> save() {
        Client client = new Client();
        return clientService.save(client);
    }
}
