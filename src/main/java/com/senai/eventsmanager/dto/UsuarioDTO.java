package com.senai.eventsmanager.dto;
import jakarta.persistence.EntityListeners;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.Date;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.senai.eventsmanager.Validation.ObrigatorioLetraMaiuscula;
import com.senai.eventsmanager.Validation.ObrigatorioNumeros;
import com.senai.eventsmanager.enums.UsuarioEnum;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class UsuarioDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @NotBlank(message = "O usuário deve informar o seu e-mail")
    @Size(max = 100, message = "Máximo de caracteres possiveis(100)")
    private String email;
    
    @NotBlank(message = "O usuário deverá inserir a sua senha ")
    @Size(max = 50, message = "Máximo de caracteres possiveis(50)")
    @ObrigatorioNumeros
    @ObrigatorioLetraMaiuscula
    private String senha;

    @NotBlank(message = "O nome deverá ser informado.")
    @Size(max = 150, min = 3, message = "O nome deverá ter no maxinmo 150 caracteres." )
    private String nome;

    @CPF
    @NotBlank(message = "O usuário deve informar o seu CPF")
    private String cpf;

    @NotBlank(message = "O usuário deve informar o seu telefone")
    @Size(max = 15, message = "Máximo de caracteres possiveis(15)")
    private String telefone;
    
    @NotNull(message = "O tipo do evento deverá ser informado.")
    private UsuarioEnum tipo;

    @NotNull(message = "A data de nascimento deve ser informada.")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
}