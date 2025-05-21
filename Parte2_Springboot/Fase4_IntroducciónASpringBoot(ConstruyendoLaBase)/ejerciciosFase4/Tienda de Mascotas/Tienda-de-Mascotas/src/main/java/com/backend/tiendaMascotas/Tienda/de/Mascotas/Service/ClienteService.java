package com.backend.tiendaMascotas.Tienda.de.Mascotas.Service;

import com.backend.tiendaMascotas.Tienda.de.Mascotas.DTO.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClienteService {
    private final List<ClienteDTO> clientes = new ArrayList<>();


    public void guardarCliente(ClienteDTO cliente) {
        clientes.add(cliente);
    }

    public List<ClienteDTO> obtenerClientes() {
        return clientes;
    }

}
