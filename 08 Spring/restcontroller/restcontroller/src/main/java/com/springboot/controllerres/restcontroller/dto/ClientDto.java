package com.springboot.controllerres.restcontroller.dto;

import lombok.Data;

@Data
public class ClientDto {

        private Long clientId;
        private String name;
        private String email;
        private String phone;
}
