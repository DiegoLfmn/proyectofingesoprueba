package com.pruebafin.cl.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="ruta")
public class rutaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ruta", length =100 )
    private Long id_ruta;

    @Column(name = "distancia_ruta", length = 9999)
    private Float distancia_ruta;

    @Column(name = "tiempo_estimado", length = 10)
    private Float tiempo_estimado;

//    @Column(name = "puntos", length = )
//    private PuntoInteres puntos;

}
