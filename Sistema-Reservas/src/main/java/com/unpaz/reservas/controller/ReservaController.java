package com.unpaz.reservas.controller;

import com.unpaz.reservas.dtos.request.DtoReqFecha;
import com.unpaz.reservas.dtos.request.ReservaDto;
import com.unpaz.reservas.dtos.response.ReservaDtoResponse;
import com.unpaz.reservas.exeptions.NotFoundException;
import com.unpaz.reservas.generic.GenericResponseController;
import com.unpaz.reservas.model.Hora;
import com.unpaz.reservas.model.Reserva;
import com.unpaz.reservas.service.imp.ReservaServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    public void modificarReserva(@RequestBody ReservaDto obj){
         reservaServiceImp.update(obj);
    }

    ///REPORTERIA PARA EL ROL ADMINISTRADOR
}
