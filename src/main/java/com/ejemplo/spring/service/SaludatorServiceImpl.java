package com.ejemplo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ejemplo.spring.model.RedSocial;

@Component("MENSAJE")
public class SaludatorServiceImpl implements SaludatorService {

	@Autowired
	@Qualifier("FACEBOOK")
	private RedSocial redSocial;
	
	public SaludatorServiceImpl() {
		super();
	}
	
	public SaludatorServiceImpl(RedSocial redSocial) {
		super();
	}
	
	public RedSocial getRedSocial() {
		return redSocial;
	}
	
	public void setRedSocial(RedSocial redSocial) {
		this.redSocial = redSocial;
	}
	
	@Override
	public void saludar(String saludo) {
		redSocial.publicar(saludo);
	}
}
