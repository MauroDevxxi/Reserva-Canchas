package com.unpaz.reservas.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Table(name="USUARIOS")
@Data
@Entity
public class Usuario {
    @Column(name="ID_USUARIO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario ;
    @Column(name="USERNAME")
    private String username;
    @Column(name="ID_PASSWORD")
    private String idPassword;
    @ManyToOne
    @JoinColumn(name="ID_CONTACTO",referencedColumnName = "ID_CONTACTO")////
    public Contacto contacto;
    @ManyToOne
    @JoinColumn(name="ID_ROL",referencedColumnName = "ID_ROL")
    public Rol rol;
}
//un usuario puede hacer muchas reservas
// una reserva es reservada por solo un usuario
