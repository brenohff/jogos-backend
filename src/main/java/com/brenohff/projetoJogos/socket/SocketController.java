package com.brenohff.projetoJogos.socket;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.brenohff.projetoJogos.domain.Nave;

@Controller
public class SocketController {

	@MessageMapping("/event/{eventId}/sendNave")
	@SendTo("/topic/event/{eventId}")
	public Nave sendMessage(@DestinationVariable String eventId, @Payload Nave nave,	SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("nave", nave);
		
		return nave;
	}
	
	@MessageMapping("/event/{eventId}/naveEscolhida")
	@SendTo("/topic/event/{eventId}")
	public Nave naveEscolhida(@DestinationVariable String eventId, @Payload Nave nave) {
		return nave;
	}
}
