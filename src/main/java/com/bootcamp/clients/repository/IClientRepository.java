package com.bootcamp.clients.repository;

import com.bootcamp.clients.entity.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IClientRepository extends ReactiveMongoRepository<Client, String> {
}
