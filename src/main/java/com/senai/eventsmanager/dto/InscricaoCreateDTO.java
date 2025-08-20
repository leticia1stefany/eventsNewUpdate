package com.senai.eventsmanager.dto;

import com.senai.eventsmanager.entity.Evento;
import com.senai.eventsmanager.entity.InscricaoStatusEnum;
import com.senai.eventsmanager.entity.Usuario;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class InscricaoCreateDTO {
    private Evento evento;
    private Usuario usuario;
    private InscricaoStatusEnum statusPagamento;
    private LocalDateTime dataHora;

    public InscricaoCreateDTO() {
    }

    public InscricaoCreateDTO(Evento evento, Usuario usuario, InscricaoStatusEnum statusPagamento, LocalDateTime dataHora) {
        this.evento = evento;
        this.usuario = usuario;
        this.statusPagamento = statusPagamento;
        this.dataHora = dataHora;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public InscricaoStatusEnum getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(InscricaoStatusEnum statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
