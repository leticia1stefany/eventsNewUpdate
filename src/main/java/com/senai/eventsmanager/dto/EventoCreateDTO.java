package com.senai.eventsmanager.dto;

import com.senai.eventsmanager.entity.EventoEnum;

import java.time.LocalDateTime;

public class EventoCreateDTO {
        // cade o id aqui?
    private String nome;
    private String descricao;
    private EventoEnum tipo;
    private String local;
    private LocalDateTime data_inicio;
    private LocalDateTime data_final;
    private String linkEvento;
    private String linkImagem;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;


    public EventoCreateDTO() {
    }

    public EventoCreateDTO(String nome, String descricao, EventoEnum tipo, String local, LocalDateTime data_inicio, LocalDateTime data_final, String linkEvento, String linkImagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.local = local;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.linkEvento = linkEvento;
        this.linkImagem = linkImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EventoEnum getTipo() {
        return tipo;
    }

    public void setTipo(EventoEnum tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDateTime getData_final() {
        return data_final;
    }

    public void setData_final(LocalDateTime data_final) {
        this.data_final = data_final;
    }

    public String getLinkEvento() {
        return linkEvento;
    }

    public void setLinkEvento(String linkEvento) {
        this.linkEvento = linkEvento;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public void setLinkImagem(String linkImagem) {
        this.linkImagem = linkImagem;
    }
}
