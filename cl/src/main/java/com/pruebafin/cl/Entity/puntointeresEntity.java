package com.pruebafin.cl.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="punto_interes")
public class puntointeresEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_punto", length = 100)
    private Long id_punto;

    @Column(name = "nombre_interes", length = 100)
    private String nombre_interes;

    @Column(name = "tipo_interes", length = 20)
    private String tipo_interes;

    @Column(name = "coordenada_x", length = 20)
    private Float coordenada_x;

    @Column(name = "coordenada_y", length = 20)
    private  Float coordenada_y;



}
