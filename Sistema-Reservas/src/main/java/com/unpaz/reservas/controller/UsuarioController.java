package com.unpaz.reservas.controller;

import com.unpaz.reservas.model.Usuario;
import com.unpaz.reservas.service.UsuarioService;
import com.unpaz.reservas.service.imp.UsuarioServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@GetMapping("/v1")//
//@RequestMapping("/usu")
@RequestMapping("/usu")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usu;
    /*private final UsuarioService usu;
    //public UsuarioController(UsuarioService usu) {
        this.usu = usu;
    }*/

    @GetMapping("/holi")
    public String prueba(){  return "Esto es una prueba chaaoooo";
    }

    @GetMapping("/get/{id}")
    public Usuario getUsu(@PathVariable Long id){
        return usu.getUsusario(id);
    }

    @GetMapping("/getall")
    public List<Usuario> getAllUsu(){
        return usu.getAllUsusario();
    }

    @PostMapping("/guardar")
    public String saveUsu(@RequestBody Usuario usuario){
        usu.saveUsu(usuario);
        return "Usuario creado con exito";
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteUsuario(@PathVariable Long id){
        usu.deleteUsu(id);
        return "Se Elimino el usuario con exito";
    }

    @PutMapping("/editar/{id_original}")
    public Usuario editUsu(@RequestParam Long idOriginal,
                           @RequestParam(required = false, name = "Usernasme") String newUsername ){
        usu.editUsu(idOriginal,newUsername);
        return usu.getUsusario(idOriginal);
    }

}
