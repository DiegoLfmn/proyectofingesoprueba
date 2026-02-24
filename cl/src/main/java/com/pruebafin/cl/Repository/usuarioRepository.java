package com.pruebafin.cl.Repository;
import com.pruebafin.cl.Entity.usuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface usuarioRepository extends JpaRepository<usuarioEntity, String> {
    List<usuarioEntity> findByNombre(String nombre);
    List<usuarioEntity> findByApellido(String apellido);
    List<usuarioEntity> findByCorreo(String correo);
}
