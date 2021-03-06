package com.rossini.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rossini.cursomc.domain.Pedido;

/* Classe DAO*/

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
