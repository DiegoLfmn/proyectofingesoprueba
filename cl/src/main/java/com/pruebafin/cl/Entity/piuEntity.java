package com.pruebafin.cl.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name ="piu")
public class piuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_piu" , length = 100)
    private Long id_piu;
    @Column(name ="codigo_piu" , length = 200)
    private String codigo;

    @Column(name = "estado_piu", length = 20)
    private  String estado;

    @Column(name = "fecha_instalacion", length = 10)
    private Date fecha_instalacion;






}
