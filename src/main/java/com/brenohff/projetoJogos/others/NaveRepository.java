package com.brenohff.projetoJogos.others;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.brenohff.projetoJogos.domain.Nave;

public interface NaveRepository extends JpaRepository<Nave, Long>{
	
	@Query("UPDATE Nave n SET n.escolhido = true WHERE n.id = :id")
	public void atualizaNave(@Param("id") Long id);
	
	@Query("UPDATE Nave n SET n.escolhido = false")
	public void resetaDados();

}
