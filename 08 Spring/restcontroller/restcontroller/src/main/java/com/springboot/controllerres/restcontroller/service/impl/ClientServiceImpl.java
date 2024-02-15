package com.springboot.controllerres.restcontroller.service.impl;

import com.springboot.controllerres.restcontroller.dto.ClientDto;
import com.springboot.controllerres.restcontroller.mapper.ClientMapper;
import com.springboot.controllerres.restcontroller.service.ClientService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientMapper clientMapper;


    
    @Override
    public List<ClientDto> getAllClients() {
        ClientDto clientDto = new ClientDto();
        clientDto.setClientId(1L);
        clientDto.setName("Juan");
        clientDto.setEmail("juan@cho.com.ar");
        clientDto.setPhone("123456789");

        List<ClientDto> clientList = List.of(clientDto);
        System.out.println(clientMapper.clientDtoToClient(clientDto));


        return clientList;
    }
}
