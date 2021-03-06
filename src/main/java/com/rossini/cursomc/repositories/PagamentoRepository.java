package com.rossini.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rossini.cursomc.domain.Pagamento;

/* Classe DAO*/

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
