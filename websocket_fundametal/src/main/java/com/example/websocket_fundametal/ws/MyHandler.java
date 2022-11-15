package com.example.websocket_fundametal.ws;

//import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

//@Slf4j
public class MyHandler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
//        log.info("Message: {}", message.getPayload());
        //session.sendMessage(new TextMessage("OK! Hello back"));
        //super.handleMessage(session, message);
    }
}
