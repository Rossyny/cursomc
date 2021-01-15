package com.rossini.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rossini.cursomc.domain.Categoria;

/* Classe DAO*/

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
