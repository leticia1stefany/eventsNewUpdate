package com.senai.eventsmanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthDTO {

    @NotBlank(message = "A senha deverá inseririda ")
    @Size(max = 50, message = "Máximo de caracteres possiveis(50)")
    private String senha;

    @NotBlank(message = "O email deve ser informado")
    @Size(max = 100, message = "Máximo de caracteres possiveis(100)")
    private String email;
}