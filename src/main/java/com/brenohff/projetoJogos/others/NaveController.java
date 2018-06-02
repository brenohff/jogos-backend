package com.brenohff.projetoJogos.others;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brenohff.projetoJogos.domain.Nave;

@RestController
public class NaveController {

	@Autowired
	private NaveService service;
	
	@RequestMapping(value = "/naves")
	public List<Nave> buscaNaves(){
		return service.buscaNaves();
	}
	
}
