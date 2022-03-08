package com.bootcamp.clients.repository;

import com.bootcamp.clients.entity.ClientType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientTypeRepository extends ReactiveMongoRepository<ClientType, String> {
}
