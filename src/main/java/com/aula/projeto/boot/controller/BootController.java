package com.aula.projeto.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {
	
	@RequestMapping("/aula")
	public String projetoAula(){
		return "Olá sou Tiago";
	}

}
