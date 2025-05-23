package com.backend.tiendaMascotas.Tienda.de.Mascotas.DTO;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    // El nombre del cliente, no puede estar vacío
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    // El email del cliente, debe tener formato válido y no puede estar vacío
    @NotBlank(message = "El email debe tener formato valido")
    @Email
    private String email;

    // El teléfono del cliente, no puede estar vacío
    @NotBlank(message = "El telefono no puede estar vacio")
    private String telefono;
}