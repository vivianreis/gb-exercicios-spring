package com.softskill.mentalidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidade")
public class MentalidadeController {
	
	@GetMapping
	public String mentalidade() {
		return "Mentalidade utilizada: Atenção aos detalhes e persistência";
	}
}
