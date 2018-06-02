package com.brenohff.projetoJogos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brenohff.projetoJogos.domain.Nave;
import com.brenohff.projetoJogos.others.NaveService;

@SpringBootApplication
public class ProjetoJogosApplication implements CommandLineRunner{
	
	@Autowired
	private NaveService service;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoJogosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Nave> naves = new ArrayList<>();
		
		Nave nave = new Nave();
		nave.setNome("Caça intergaláctico");
		nave.setLink_gif("http://gameznet.com.au//aliens/animated/ufo//spaceship.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Bombardeiro militar");
		nave.setLink_gif("https://media.giphy.com/media/Xlj086SIFAqty/source.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Caça estelar");
		nave.setLink_gif("https://denniscooperblog.com/wp-content/uploads/2017/02/1436930896937.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Nave supersônica");
		nave.setLink_gif("https://cdn.wcnews.com/newestshots/full/klavs_models315.gif");
		naves.add(nave);
		
		for(Nave spaceship : naves) {
			spaceship.setValor_ataque(200);
			spaceship.setValor_vida(1200);
			service.salvarNaves(spaceship);
		}
		
	}
}
