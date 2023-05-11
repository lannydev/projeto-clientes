package com.clientes.clientes.service;

import com.clientes.clientes.entities.Cliente;
import com.clientes.clientes.repositories.Clienterepository;
import dto.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    @Autowired
    private Clienterepository clienterepository;

    public List<ClienteDto> findAll(){
      final var lista = clienterepository.findAll();
      final var dto = lista.stream().map(x -> new ClienteDto(x)).collect(Collectors.toList());
      return dto;

    }
}
