package com.senai.eventsmanager.repository;

import com.senai.eventsmanager.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.senai.eventsmanager.enums.UsuarioEnum;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.tipo = :tipo")
    List<Usuario> findByTipo(UsuarioEnum tipo);
}
