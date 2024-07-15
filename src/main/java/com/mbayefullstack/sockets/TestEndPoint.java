package com.mbayefullstack.sockets;


import jakarta.websocket.OnOpen;
import jakarta.websocket.server.ServerEndpoint;


@ServerEndpoint(value="/djdj/{username}",
decoders = {JSONTextDecoder.class})
public class TestEndPoint{
	
	@OnOpen
	public void messageOnOpen() {
		
	}
}
