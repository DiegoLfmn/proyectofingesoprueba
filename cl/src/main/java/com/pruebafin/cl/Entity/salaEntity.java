package com.pruebafin.cl.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="sala")
public class salaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sala", length = 100)
    private Long id_sala;

    @Column(name = "codigo_sala", length = 200)
    private String codigo_sala;

    @Column(name = "piso_sala", length = 20)
    private Integer  piso_sala;

    @Column(name = "capacidad_sala", length = 10)
    private Integer capacidad_sala;

}
