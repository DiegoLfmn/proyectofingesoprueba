package com.pruebafin.cl.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="edificio")
public class edificioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_edificio", length = 100)
    private Long id_edificio;

    @Column(name = "nombre_edificio", length = 20)
    private String nombre_edificio;

    @Column(name = "codigo_edificio", length = 100)
    private String codigo_edificio;


}
