package com.unpaz.reservas.service.imp;

import com.unpaz.reservas.model.Usuario;
import com.unpaz.reservas.repository.UsuarioRepository;
import com.unpaz.reservas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImp implements UsuarioService {
    @Autowired
    private UsuarioRepository usuRepo;
    @Override
    public Usuario getUsusario(Long id) {
        return usuRepo.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> getAllUsusario() {
        return (List<Usuario>) usuRepo.findAll();
    }

    @Override
    public void saveUsu(Usuario usu) {
        usuRepo.save(usu);
    }

    @Override
    public void deleteUsu(Long id) {
        usuRepo.deleteById(id);
    }

    @Override
    public void editUsu(Long idOriginal, String newUsername) {
        Usuario us = usuRepo.findById(idOriginal).orElse(null);
        us.setUsername(newUsername);
        usuRepo.save(us);
    }
}
