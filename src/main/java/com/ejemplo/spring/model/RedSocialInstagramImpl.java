package com.ejemplo.spring.model;

import org.springframework.stereotype.Component;

@Component("INSTAGRAM")
public class RedSocialInstagramImpl implements RedSocial{
	
	@Override
	public void publicar(String msg) {
		System.out.println("Publicando mensaje en Instagram...");
		System.out.println("Compartiendo " +msg);
	}

}
