package com.senai.eventsmanager.dto;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.senai.eventsmanager.enums.EventoEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventoDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    
    @NotBlank(message = "O nome deverá ser informado.")
    @Size(max = 150, message = "O nome deverá ter no maxinmo 150 caracteres." )
    private String nome;

    @NotBlank(message = "A descrição deverá ser informado.")
    @Size(max = 500, message = "A descrição deverá ter no maxinmo 500 caracteres." )
    private String descricao;

    @NotNull(message = "O tipo do evento deverá ser informado.")
    private EventoEnum tipo;

    @NotBlank(message = "O local deverá ser informado.")
    @Size(max = 150, message = "O local deverá ter no maxinmo 150 caracteres." )
    private String local;

    @NotNull(message = "A data inical do evento deve ser informada.")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataInicio;

    @NotNull(message = "A data final do evento deve ser informada.")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataFinal;

    private String linkEvento;
    private String linkImagem;
}
