package com.pruebafin.cl.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="campus")
public class campusEntity {
    @Column(name = "id_campus", length = 100)
    private Long id_campus;

    @Column(name = "nombre_campus", length = 100)
    private String nombre_campus;

}
