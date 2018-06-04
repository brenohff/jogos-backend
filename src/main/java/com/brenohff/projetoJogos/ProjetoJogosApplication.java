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
		nave.setNome("Innuendo");
		nave.setLink_gif("http://gameznet.com.au//aliens/animated/ufo//spaceship.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Burninator");
		nave.setLink_gif("https://media.giphy.com/media/Xlj086SIFAqty/source.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Vengeance");
		nave.setLink_gif("https://denniscooperblog.com/wp-content/uploads/2017/02/1436930896937.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Agememnon");
		nave.setLink_gif("https://cdn.wcnews.com/newestshots/full/klavs_models315.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Dark Phoenix");
		nave.setLink_gif("https://media.giphy.com/media/o0aao3ygIJMoo/source.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Annihilator");
		nave.setLink_gif("http://bestanimations.com/Sci-Fi/Spaceships/spaceship-starship-animated-gif-19.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Sagittarius");
		nave.setLink_gif("https://media.giphy.com/media/vJSowWKYv9qVy/source.gif");
		naves.add(nave);
		
		nave = new Nave();
		nave.setNome("Excursionist");
		nave.setLink_gif("https://orig00.deviantart.net/9485/f/2014/126/9/9/c4d_spaceship___satellite_gif_animation_by_maximilianyuen-d7hdhvt.gif");
		naves.add(nave);
		
		for(Nave spaceship : naves) {
			spaceship.setValor_ataque(200);
			spaceship.setValor_vida(1200);
			service.salvarNaves(spaceship);
		}
		
	}
}
