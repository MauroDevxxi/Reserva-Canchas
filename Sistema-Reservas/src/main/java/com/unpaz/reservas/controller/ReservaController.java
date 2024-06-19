package com.unpaz.reservas.controller;

import com.unpaz.reservas.dtos.request.DtoReqFecha;
import com.unpaz.reservas.dtos.request.ReservaDto;
import com.unpaz.reservas.exeptions.NotFoundException;
import com.unpaz.reservas.generic.GenericResponseController;
import com.unpaz.reservas.model.Hora;
import com.unpaz.reservas.model.Reserva;
import com.unpaz.reservas.service.imp.ReservaServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/api")
@RestController
@Validated
@Slf4j
public class ReservaController implements GenericResponseController {
    @Autowired
    private ReservaServiceImp reservaServiceImp;

    @GetMapping("/alo")
    public String hola(){
        return "Estamos probando la app";
    }

    //Read lista de horas libres por dia
    @PostMapping("/reservation/available-hour")
    public List<Hora> getAll(@RequestBody DtoReqFecha fechaDto) {
        return reservaServiceImp.listarHorasLibres(fechaDto.getFecha());
    }

    //este nos crea una reserva
    @PostMapping("/reservation")
    public ResponseEntity<?> createReserva(@RequestBody Reserva reserva)throws NotFoundException {
        clearResponse();
        reservaServiceImp.save(reserva);
        response.put("data", HttpStatus.CREATED.getReasonPhrase());
        return getResponse(HttpStatus.CREATED);
    }

    /*@PostMapping("/reservation")
    public Reserva createReserva(@RequestBody ReservaDto reserva){

        return reservaServiceImp.save(reserva);
    }*/
    /*@PostMapping("/invgate")
    public  ResponseEntity<?>  postNotification(@RequestBody TicketCreateInvgateDto ticket) throws NotFoundException {
        clearResponse();
        response.put("data", ticketService.saveInvgate(ticket));
        return getResponse(HttpStatus.OK);
    }*/


    @PostMapping("/reservation/modificar/reserva")
    public ResponseEntity<Map<String, Object>> modificarReserva(@RequestBody ReservaDto obj)throws NotFoundException{
        clearResponse();
        response.put("data", reservaServiceImp.actualizar(obj));
        return getResponse(HttpStatus.OK);

    }

    //Como deuda tecnica nos queda barrer el campo boleano de la tabla HORAS
    //para marcar que estan ocupadas

    // y falta una restriccion para la modificacion de reserva. que es validar
    //si el boleano de la tabla horas esta true o false

    ///REPORTERIA PARA EL ROL ADMINISTRADOR

    //valor en pesos por rango de fecha

    //cantidad de horas libres en rango re fecha

    //cantidad dew horas ocupadas en un rango de fechas
}
