package com.springboot.controllerres.restcontroller.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/*
Crea una entidad llamada Cliente con los siguientes atributos: id (como clave principal),
nombre, email, teléfono, y cualquier otro atributo que desees.
 */
@Entity
@Data
public class Client {

    @Id
    private Long clientId;

    private String name;
    private String email;
    private String phone;

}
