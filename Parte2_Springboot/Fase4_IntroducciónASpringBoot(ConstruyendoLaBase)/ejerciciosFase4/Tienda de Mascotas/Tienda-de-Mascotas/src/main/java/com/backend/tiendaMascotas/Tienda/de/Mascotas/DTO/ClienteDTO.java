package com.backend.tiendaMascotas.Tienda.de.Mascotas.DTO;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotBlank(message = "El email debe tener formato valido")
    @Email
    private String email;

    @NotBlank(message = "El telefono no puede estar vacio")
    private String telefono;
}