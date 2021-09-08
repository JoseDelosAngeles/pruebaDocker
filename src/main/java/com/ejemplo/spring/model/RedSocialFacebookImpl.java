package com.ejemplo.spring.model;

import org.springframework.stereotype.Component;

@Component("FACEBOOK")
public class RedSocialFacebookImpl implements RedSocial{

	@Override
	public void publicar(String msg) {
		System.out.println("Publicando mensaje en Facebook...");
		System.out.println("Publicando en el muro: " + msg);
	}
}
