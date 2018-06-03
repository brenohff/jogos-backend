package com.brenohff.projetoJogos.others;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.brenohff.projetoJogos.domain.Nave;

public interface NaveRepository extends JpaRepository<Nave, Long> {

	@Transactional
	@Modifying
	@Query("UPDATE Nave n SET n.escolhido = true WHERE n.id = :id")
	public void atualizaNave(@Param("id") Long id);

	@Transactional
	@Modifying
	@Query("UPDATE Nave n SET n.escolhido = false")
	public void resetaDados();

}
