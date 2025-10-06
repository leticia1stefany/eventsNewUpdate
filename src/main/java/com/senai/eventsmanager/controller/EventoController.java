package com.senai.eventsmanager.controller;

import com.senai.eventsmanager.dto.EventoDTO;
import com.senai.eventsmanager.service.EventoService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/evento")
public class EventoController {
    @Autowired
    EventoService service;

    @GetMapping("calendario/{dataInicio}/{dataFinal}")
    public List<EventoDTO> calendario(@PathVariable String dataInicio, @PathVariable String dataFim){
        return service.calendario(dataInicio, dataFim);
    }
    @GetMapping("/{id}")
    public EventoDTO findById(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @GetMapping
    public List<EventoDTO> findAll(){
        return service.findAll();
    }
    @PostMapping
    public EventoDTO save(
            @RequestBody EventoDTO eventoCreateDTO ){
        return service.save(eventoCreateDTO);
    }
    @PutMapping("/{id}")
    public EventoDTO update(
            @PathVariable("id")Long id,
            @RequestBody @Valid EventoDTO eventoCreateDTO){
        return service.update(id,eventoCreateDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Long id){
        service.deleteById(id);
    }


}
