package com.unpaz.reservas.repository;

import com.unpaz.reservas.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Long> {
}
