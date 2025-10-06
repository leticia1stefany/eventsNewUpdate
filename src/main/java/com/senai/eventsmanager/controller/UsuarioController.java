package com.senai.eventsmanager.controller;

import com.senai.eventsmanager.dto.UsuarioDTO;
import com.senai.eventsmanager.enums.UsuarioEnum;
import com.senai.eventsmanager.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;

    @GetMapping("/filtro/{tipo}")
    public List<UsuarioDTO> filtro(@PathVariable("tipo") UsuarioEnum tipo){
        return service.findByTipo(tipo);
    }
    @GetMapping("/usuario/{maiorIdade}")
    public List<UsuarioDTO> usuario(@PathVariable Boolean maiorIdade){
        return service.usuario(maiorIdade);
    }
    @GetMapping("/{id}")
    public UsuarioDTO findById(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @GetMapping
    public List<UsuarioDTO> findAll(){
        return service.findAll();
    }
    @PostMapping
    public UsuarioDTO save(
            @RequestBody UsuarioDTO usuarioCreateDTO ){
        return service.save(usuarioCreateDTO);
    }
    @PutMapping("/{id}")
    public UsuarioDTO update(
            @PathVariable("id")Long id,
            @RequestBody UsuarioDTO usuarioCreateDTO){
        return service.update(id,usuarioCreateDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Long id){
        service.deleteById(id);
    } 
}
