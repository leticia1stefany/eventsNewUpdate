package com.senai.eventsmanager.service;

import com.senai.eventsmanager.dto.EventoCreateDTO;
import com.senai.eventsmanager.entity.Evento;
import com.senai.eventsmanager.entity.EventoEnum;
import com.senai.eventsmanager.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;


    public EventoCreateDTO findById(UUID id) {
        //retorna um entidade Evento
        Optional<Evento> evento = eventoRepository.findById(id);
        //método para converter um evento entity em eventoCreateDto
        EventoCreateDTO eventoCreateDTO = convertToDto(evento);
        return eventoCreateDTO;
    }
    public EventoCreateDTO convertToDto(Evento evento){
        EventoCreateDTO eventoCreateDTO = new EventoCreateDTO();
        //pegar os dados de evento e passar para o eventoCreateDto
        eventoCreateDTO.setNome(evento.getNome());
        eventoCreateDTO.setDescricao(evento.getDescricao());
        eventoCreateDTO.setTipo(evento.getTipo());
        eventoCreateDTO.setLocal(evento.getLocal());
        eventoCreateDTO.setData_inicio(evento.getData_inicio());
        eventoCreateDTO.setData_final(evento.getData_final());
        eventoCreateDTO.setLinkEvento(evento.getLinkEvento());
        eventoCreateDTO.setLinkImagem(evento.getLinkImagem());
        return eventoCreateDTO;
    }
    public Evento convertToEntity(EventoCreateDTO eventoCreateDTO){
        Evento evento = new Evento();
        evento.setNome(eventoCreateDTO.getNome());
        evento.setDescricao(eventoCreateDTO.getDescricao());
        evento.setTipo(eventoCreateDTO.getTipo());
        evento.setLocal(eventoCreateDTO.getLocal());
        evento.setData_inicio(eventoCreateDTO.getData_inicio());
        evento.setData_final(eventoCreateDTO.getData_final());
        evento.setLinkEvento(eventoCreateDTO.getLinkEvento());
        evento.setLinkImagem(eventoCreateDTO.getLinkImagem());
        return evento;
    }
}
