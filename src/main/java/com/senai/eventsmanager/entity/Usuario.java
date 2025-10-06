package com.senai.eventsmanager.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.senai.eventsmanager.enums.UsuarioEnum;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)

   public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false, length = 50)
    private String senha;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false, length = 15, unique = true)
    private String cpf;

    @Column(nullable = false, length = 15)
    private String telefone;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private UsuarioEnum tipo;

    @Column(nullable = false)
    private Date dataNascimento;

    @CreatedDate
    @Column(nullable =  false, updatable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Column(nullable = true)
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "usuario")
    private List<Inscricao> inscricoes;

}