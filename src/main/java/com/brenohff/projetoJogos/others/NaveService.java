package com.brenohff.projetoJogos.others;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenohff.projetoJogos.domain.Nave;

@Service
public class NaveService {
	
	@Autowired
	private NaveRepository repository;
	
	public void salvarNaves(Nave nave) {
		repository.save(nave);
	}
	
	public List<Nave> buscaNaves() {
		return repository.findAll();
	}
	
	public void atualizaNave(Nave nave) {
		repository.atualizaNave(nave.getId());
	}
	
	public void resetaDados() {
		repository.resetaDados();
	}
	
	
}
