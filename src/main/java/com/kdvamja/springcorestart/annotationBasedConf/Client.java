package com.kdvamja.springcorestart.annotationBasedConf;

import org.springframework.stereotype.Component;

@Component
public class Client {
	private int clientId;
	private String name;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + "]";
	}
}
