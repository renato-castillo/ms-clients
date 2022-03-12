package com.bootcamp.clients.entity;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PersonClient extends Person {
    private String lastName;
    private String dni;
    private String gender;

}
