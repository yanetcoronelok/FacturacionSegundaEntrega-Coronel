package dev.yanetcoronel.coderhouse_entrega.controller;

import dev.yanetcoronel.coderhouse_entrega.model.Cliente;
import dev.yanetcoronel.coderhouse_entrega.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/agregar")
    public Cliente agregarCliente(@RequestBody Cliente cliente) {
        return clienteService.agregarCliente(cliente);
    }
    
    @GetMapping("/buscar/{id}")
    public Optional<Cliente> buscarCliente(@PathVariable Long id){
        return clienteService.buscarCliente(id);
    }
}