package com.rossini.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rossini.cursomc.domain.Estado;

/* Classe DAO*/

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
