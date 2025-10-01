package com.senai.eventsmanager.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.senai.eventsmanager.entity.Evento;
import com.senai.eventsmanager.entity.Usuario;
import jakarta.validation.constraints.NotNull;

public class InscricaoDTO {

@JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @NotNull(message = "O evento deverá ser informado")
    private Evento evento;

    @NotNull(message = "O usuario deverá ser informado")
    private Usuario usuario;

}