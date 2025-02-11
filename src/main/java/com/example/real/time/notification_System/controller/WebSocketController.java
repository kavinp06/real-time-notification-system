package com.example.real.time.notification_System.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;


@RestController
public class WebSocketController extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        // Broadcast message to all connected clients
        try {
            session.sendMessage(new TextMessage("Broadcasting: " + message.getPayload()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}