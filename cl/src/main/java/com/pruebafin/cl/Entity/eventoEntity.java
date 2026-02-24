package com.pruebafin.cl.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
@Entity
@Table(name = "evento")
public class eventoEntity extends contenidoEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "id_evento", length = 100)
    private Long id_evento;

    @Column(name = "fecha", length = 10)
    private Date fecha;

    @Column(name = "hora_inicio", length = 8)
    private Time hora_inicio;

    @Column(name = "hora_fin", length = 8)
    private Time hora_fin;

    @Column(name = "tipo_evento", length = 30)
    private String tipo_evento;

    @Column(name = "organizador", length = 20)
    private String organizador;

//    @Column(name = "sala", length = 10)
    // ver como hacer para juntar ya que es un TIPO sala

    /// SALA
    @ManyToOne
    @JoinColumn(name = "sala_id")
    private salaEntity sala;

}
