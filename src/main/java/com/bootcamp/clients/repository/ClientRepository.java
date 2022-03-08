package com.bootcamp.clients.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository<ClientRepository, String> {
}
