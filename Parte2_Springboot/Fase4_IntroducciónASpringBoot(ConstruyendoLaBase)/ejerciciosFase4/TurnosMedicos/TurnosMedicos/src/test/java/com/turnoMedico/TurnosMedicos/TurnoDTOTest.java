package com.turnoMedico.TurnosMedicos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.turnoMedico.TurnosMedicos.model.TurnoDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurnoDTOTest {
    @Test
    void testDeserializationWithLombok() throws Exception {
        // JSON de prueba
        String json = "{ \"nombrePaciente\": \"Juan Pérez\", \"especialidad\": \"Cardiología\" }";

        // Jackson ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Intenta deserializar el JSON en un objeto TurnoDTO
        TurnoDTO turno = objectMapper.readValue(json, TurnoDTO.class);

        // Verifica que los campos se deserializaron correctamente
        assertNotNull(turno);
        assertEquals("Juan Pérez", turno.getNombrePaciente());
        assertEquals("Cardiología", turno.getEspecialidad());
    }
}
