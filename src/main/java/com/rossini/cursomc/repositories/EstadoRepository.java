package com.rossini.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rossini.cursomc.domain.Estado;

/* Classe DAO*/

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

	
	@Transactional(readOnly=true)
	public List<Estado> findAllByOrderByNome();
}
