package com.unpaz.reservas.service;

import com.unpaz.reservas.dtos.request.ReservaDto;
import com.unpaz.reservas.generic.CrudGeneric;
import com.unpaz.reservas.model.Hora;
import com.unpaz.reservas.model.Reserva;

import java.util.Date;
import java.util.List;

public interface ReservaService extends CrudGeneric<Reserva, Long> {
    ReservaDto save(Reserva obj);
    List<Hora> listarHorasLibres(Date Fecha);
}
