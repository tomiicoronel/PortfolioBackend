package com.backend.tiendaMascotas.Tienda.de.Mascotas.Controllers;


import com.backend.tiendaMascotas.Tienda.de.Mascotas.DTO.ClienteDTO;
import com.backend.tiendaMascotas.Tienda.de.Mascotas.Service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteService.obtenerClientes();
    }

    @PostMapping
    public ResponseEntity<String> agregarCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
        clienteService.guardarCliente(clienteDTO);
        return ResponseEntity.ok("Cliente registrado con éxito.");
    }
}
