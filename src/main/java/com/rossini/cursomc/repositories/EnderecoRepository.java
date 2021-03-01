package com.rossini.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rossini.cursomc.domain.Endereco;

/* Classe DAO*/

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
