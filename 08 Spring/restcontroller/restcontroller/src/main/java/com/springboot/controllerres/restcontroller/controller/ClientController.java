package com.springboot.controllerres.restcontroller.controller;

import com.springboot.controllerres.restcontroller.dto.ClientDto;
import com.springboot.controllerres.restcontroller.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ClientDto>> getAllClients(){
        List<ClientDto> clientList = clientService.getAllClients();

        return new ResponseEntity<>(clientList, HttpStatus.OK);
    }
}
