package com.clientes.clientes.repositories;

import com.clientes.clientes.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Clienterepository extends JpaRepository<Cliente, Long> {
}
