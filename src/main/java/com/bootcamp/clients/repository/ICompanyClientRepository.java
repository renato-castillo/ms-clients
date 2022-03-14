package com.bootcamp.clients.repository;

import com.bootcamp.clients.entity.CompanyClient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

@Repository
public interface ICompanyClientRepository  extends ReactiveMongoRepository<CompanyClient, String> {

}
