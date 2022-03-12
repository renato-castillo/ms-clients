package com.bootcamp.clients.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonClientDto {
    private String id;
    private String dni;
    private  String name;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String gender;
    private DocumentTypeDto documentType;
}
