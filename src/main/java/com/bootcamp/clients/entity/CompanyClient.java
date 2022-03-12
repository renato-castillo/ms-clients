package com.bootcamp.clients.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyClient extends Person{
    private String ruc;
    private String tradeName;
}
