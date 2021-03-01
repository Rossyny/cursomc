package com.rossini.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rossini.cursomc.domain.Cliente;

/* Classe DAO*/

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
