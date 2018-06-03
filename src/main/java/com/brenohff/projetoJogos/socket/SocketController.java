package com.brenohff.projetoJogos.socket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.brenohff.projetoJogos.domain.Nave;

@Controller
public class SocketController {

	@MessageMapping("/event/1/sendNave")
	@SendTo("/topic/event/1")
	public Nave sendMessage(@Payload Nave nave,	SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("nave", nave);
		
		return nave;
	}	
}
