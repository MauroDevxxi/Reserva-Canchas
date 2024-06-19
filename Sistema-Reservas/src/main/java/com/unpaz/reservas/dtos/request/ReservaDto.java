package com.unpaz.reservas.dtos.request;

import com.unpaz.reservas.model.Reserva;
import lombok.Data;

import java.util.Date;

@Data
public class ReservaDto {
    private Long idReserva;
    private Long idUsuario;
    private Long idCanchaPrecio ;
    private Date fecha;
    private Long idHora;

    public ReservaDto() {
    }

    public ReservaDto(Reserva reserva){
        this.idReserva = reserva.getIdReserva();
        this.idUsuario = reserva.getUsu().getId_usuario();
        this.idCanchaPrecio = reserva.getCanchaPrecio().getIdCanchaPrecio();
        this.fecha = reserva.getFecha();
        this.idHora = reserva.getHora().getIdHora();
    }
}
