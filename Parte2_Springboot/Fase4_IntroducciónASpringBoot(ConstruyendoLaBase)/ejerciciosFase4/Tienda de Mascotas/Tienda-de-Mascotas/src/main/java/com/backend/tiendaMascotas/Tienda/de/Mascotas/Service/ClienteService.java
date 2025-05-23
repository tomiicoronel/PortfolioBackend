package com.backend.tiendaMascotas.Tienda.de.Mascotas.Service;

import com.backend.tiendaMascotas.Tienda.de.Mascotas.DTO.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ClienteService {
    // Lista en memoria para almacenar los clientes registrados
    private final List<ClienteDTO> clientes = new ArrayList<>();

    /**
     * Guarda un nuevo cliente en la lista.
     *
     * @param cliente el cliente a guardar
     */
    public void guardarCliente(ClienteDTO cliente) {
        clientes.add(cliente);
    }

    /**
     * Obtiene la lista de todos los clientes registrados.
     *
     * @return lista de clientes
     */
    public List<ClienteDTO> obtenerClientes() {
        return clientes;
    }
}
