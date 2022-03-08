package com.bootcamp.clients.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ClientType {

    @Id
    private String id;
}
