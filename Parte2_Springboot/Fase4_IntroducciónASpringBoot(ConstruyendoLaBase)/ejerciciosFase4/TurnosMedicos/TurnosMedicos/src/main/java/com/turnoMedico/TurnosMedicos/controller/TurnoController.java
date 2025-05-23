package com.turnoMedico.TurnosMedicos.controller;

import com.turnoMedico.TurnosMedicos.model.TurnoDTO;
import com.turnoMedico.TurnosMedicos.service.TurnoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Anotación que indica que esta clase es un controlador REST
@RestController
// Define la ruta base para los endpoints de este controlador
@RequestMapping("/turnos")
public class TurnoController {

    // Inyección de dependencia para el servicio de turnos
    @Autowired
    private TurnoService turnoService;

    /**
     * Endpoint para listar todos los turnos registrados.
     * @return Una lista de objetos TurnoDTO.
     */
    @GetMapping
    public List<TurnoDTO> listarTurnos() {
        // Llama al servicio para obtener la lista de turnos
        return turnoService.getTurnos();
    }

    /**
     * Endpoint para agregar un nuevo turno.
     * @param turnoDTO Objeto TurnoDTO recibido en el cuerpo de la solicitud.
     * @return Una respuesta HTTP con un mensaje de éxito.
     */
    @PostMapping
    public ResponseEntity<String> agregarTurno(@Valid @RequestBody TurnoDTO turnoDTO) {
        // Llama al servicio para guardar el turno
        turnoService.guardarTurno(turnoDTO);
        // Devuelve una respuesta indicando que el turno fue registrado con éxito
        return ResponseEntity.ok("Turno registrado con éxito.");
    }
}

