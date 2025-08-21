package com.senai.eventsmanager.controller;

import com.senai.eventsmanager.dto.InscricaoCreateDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/inscricao")
public class InscricaoController {
    //pegar um inscricao pelo seu id
    @GetMapping("/{id}")
    public InscricaoCreateDTO findById(@PathVariable("id") UUID id){
        return service.findById(id);
    }
    // pegar todas as inscricoes
    @GetMapping
    public List<InscricaoCreateDTO> findAll(){
        return service.findAll();
    }
    // salvar uma inscricao
    @PostMapping
    public InscricaoCreateDTO save(
            @RequestBody InscricaoCreateDTO inscricaoCreateDTO ){
        return service.save(inscricaoCreateDTO);
    }
    // atualizar uma inscricao
    @PutMapping("/{id}")
    public InscricaoCreateDTO update(
            @PathVariable("id")UUID id,
            @RequestBody InscricaoCreateDTO inscricaoCreateDTO){
        return service.update(id,inscricaoCreateDTO);
    }
    // deletar um inscricao pelo seu id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")UUID id){
        service.deleteById(id);
    }

}
