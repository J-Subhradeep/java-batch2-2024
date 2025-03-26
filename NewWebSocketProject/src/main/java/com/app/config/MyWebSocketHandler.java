package com.app.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import com.app.utils.WebSocketUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class MyWebSocketHandler implements WebSocketHandler {
	
	
	public static Map<String, WebSocketSession> sessions = new HashMap<>();

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		// TODO Auto-generated method stub

		String id = WebSocketUtils.getQueryParam(session.getUri().toString(), "id");
		sessions.put(id, session);
		
	
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		// TODO Auto-generated method stub
        ObjectMapper objectMapper = new ObjectMapper();

        // Parse JSON string
        JsonNode jsonNode = objectMapper.readTree(message.getPayload().toString());

        // Extract values
        String msg = jsonNode.get("message").asText();
        String to = jsonNode.get("to").asText();
        
        WebSocketSession webSocketSession = sessions.get(to);
        webSocketSession.sendMessage(new TextMessage(msg));
		System.out.println(msg +" "+ to);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean supportsPartialMessages() {
		// TODO Auto-generated method stub
		return false;
	}



}
