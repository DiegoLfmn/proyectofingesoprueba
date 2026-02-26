package com.pruebafin.cl.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bitacora_acceso")
public class bitacoraAccesoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro", length = 100)
    private Long id_registro;

    @Column(name = "fecha_hora", length = 20)
    private String fecha_hora;

    @Column(name = "tipo_operacion", length = 100)
    private String tipo_operacion;

    @Column(name = "detalle_bitacora", length = 1024)
    private String detalle_bitacora;

//    @Column(name = "usuario", length = 20)
//    private Usuario usuario; ver como conectar con entidad usuario

//    @Column(name = "piu", length = 100)
//    private PIU piu;

//    @Column(name = "contenido", length = 100)
//    private CONTENIDO contenido;

//    @Column(name = "ruta", length = 100)
//    private RUTA ruta;

    /// USUARIO
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private usuarioEntity usuario;

    /// CONTENIDO
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contenido_id")
    private contenidoEntity contenido;

    /// RUTA
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ruta_id")
    private rutaEntity ruta;

    /// PIU
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "piu_id")
    private piuEntity piuDeBita;
}

