package com.rossini.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rossini.cursomc.domain.Produto;

/* Classe DAO*/

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
