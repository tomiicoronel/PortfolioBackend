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
    // Inyección del servicio que gestiona la lógica de clientes
    @Autowired
    private ClienteService clienteService;

    // Endpoint para obtener la lista de todos los clientes registrados
    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteService.obtenerClientes();
    }

    // Endpoint para registrar un nuevo cliente
    // Valida el cuerpo de la petición antes de guardar
    @PostMapping
    public ResponseEntity<String> agregarCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
        clienteService.guardarCliente(clienteDTO);
        return ResponseEntity.ok("Cliente registrado con éxito.");
    }
}
