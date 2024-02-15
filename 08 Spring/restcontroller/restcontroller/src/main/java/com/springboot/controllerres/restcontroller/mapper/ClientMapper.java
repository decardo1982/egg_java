package com.springboot.controllerres.restcontroller.mapper;

import com.springboot.controllerres.restcontroller.dto.ClientDto;
import com.springboot.controllerres.restcontroller.entity.Client;
import org.mapstruct.Mapper;

@Mapper
public interface ClientMapper {
    Client clientDtoToClient(ClientDto clientDto);

    ClientDto clientToClientDto(Client client);
}
