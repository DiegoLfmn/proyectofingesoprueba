package com.pruebafin.cl.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name ="campus")
public class campusEntity {
    @Column(name = "id_campus", length = 100)
    private Long id_campus;

    @Column(name = "nombre_campus", length = 100)
    private String nombre_campus;


    /// EDIFICIO
    @OneToMany(mappedBy = "campus")
    private Set<edificioEntity> edificios = new HashSet<>();

    /// PUNTO INTERES
    @OneToMany(mappedBy = "campus")
    private Set<puntointeresEntity> puntosEnCampus = new HashSet<>();

}
