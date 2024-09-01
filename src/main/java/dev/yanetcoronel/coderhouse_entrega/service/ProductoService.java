package dev.yanetcoronel.coderhouse_entrega.service;

import dev.yanetcoronel.coderhouse_entrega.model.Producto;
import dev.yanetcoronel.coderhouse_entrega.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Optional<Producto> buscarProducto(Long id) {
        return productoRepository.findById(id);
    }
}