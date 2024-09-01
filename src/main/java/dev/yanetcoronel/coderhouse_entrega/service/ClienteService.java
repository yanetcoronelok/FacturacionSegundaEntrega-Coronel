package dev.yanetcoronel.coderhouse_entrega.service;

import dev.yanetcoronel.coderhouse_entrega.model.Cliente;
import dev.yanetcoronel.coderhouse_entrega.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente agregarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarCliente(Long id) {
        return clienteRepository.findById(id);
    }

}