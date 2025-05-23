package com.turnoMedico.TurnosMedicos.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TurnoDTO {
// Nombre del paciente, no puede estar vacío
@NotBlank(message = "El nombre no puede estar vacio")
private String nombrePaciente;

// Especialidad médica, no puede estar vacía
@NotBlank(message = "La especialidad no puede estar vacia")
private String especialidad;
}