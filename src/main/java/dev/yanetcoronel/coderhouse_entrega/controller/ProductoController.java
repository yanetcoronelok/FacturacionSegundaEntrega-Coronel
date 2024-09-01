package dev.yanetcoronel.coderhouse_entrega.controller;

import dev.yanetcoronel.coderhouse_entrega.model.Cliente;
import dev.yanetcoronel.coderhouse_entrega.model.Producto;
import dev.yanetcoronel.coderhouse_entrega.service.ClienteService;
import dev.yanetcoronel.coderhouse_entrega.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping("/agregar")
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

    @GetMapping("/buscar/{id}")
    public Optional<Producto> buscarProducto(@PathVariable Long id){
        return productoService.buscarProducto(id);
    }
}