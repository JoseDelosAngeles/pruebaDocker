package com.ejemplo.spring.model;

import org.springframework.stereotype.Component;

@Component("TWITTER")
public class RedSocialTwitterImpl implements RedSocial{
	
	@Override
	public void publicar(String msg) {
		System.out.println("Publicando mensaje en Twitter...");
		System.out.println("Twitteando: " + msg);
	}

}
