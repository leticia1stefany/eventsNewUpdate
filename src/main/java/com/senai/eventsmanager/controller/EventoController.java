package com.senai.eventsmanager.controller;

import com.senai.eventsmanager.dto.EventoDTO;
import com.senai.eventsmanager.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/evento")
//  http://localhost:8080/api/v1/evento/1
public class EventoController {
    @Autowired
    EventoService service;

    @GetMapping("/{id}")
    public EventoDTO findById(@PathVariable("id") UUID id){
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
            @PathVariable("id")UUID id,
            @RequestBody EventoDTO eventoCreateDTO){
        return service.update(id,eventoCreateDTO);
    }
   
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")UUID id){

        service.deleteById(id);
    }


}
