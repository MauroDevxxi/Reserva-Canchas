package com.unpaz.reservas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Table(name = "CANCHAS_PRECIOS")
@Entity
@Data
public class CanchaPrecio {
    @Column(name = "ID_CANCHAS_PRECIOS")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idCanchaPrecio;
    @ManyToOne
    @JoinColumn(name = "ID_CANCHA",referencedColumnName = "ID_CANCHA")
    private Canchas canchas;
    @ManyToOne
    @JoinColumn(name = "ID_PRECIO",referencedColumnName = "ID_PRECIO")
    private PrecioHora precioHora;
}
