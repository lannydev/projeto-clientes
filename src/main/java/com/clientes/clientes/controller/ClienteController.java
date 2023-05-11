package com.clientes.clientes.controller;

import com.clientes.clientes.service.ClienteService;
import dto.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/listar-clientes")
    public List<ClienteDto> findALL(){
        List<ClienteDto> lista = clienteService.findAll();
        return lista;

    }
}
