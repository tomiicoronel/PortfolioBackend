package com.turnoMedico.TurnosMedicos.service;

import com.turnoMedico.TurnosMedicos.model.TurnoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TurnoService {
    // Lista para almacenar los turnos registrados en memoria
    private final List<TurnoDTO> turnos = new ArrayList<>();

    /**
     * Metodo para guardar un turno en la lista.
     * @param turnoDTO Objeto que representa el turno a registrar.
     */
    public void guardarTurno(TurnoDTO turnoDTO) {
        turnos.add(turnoDTO); // Agrega el turno a la lista
    }

    /**
     * Metodo para obtener la lista de todos los turnos registrados.
     * @return Lista de objetos TurnoDTO.
     */
    public List<TurnoDTO> getTurnos() {
        return turnos; // Devuelve la lista de turnos
    }
}