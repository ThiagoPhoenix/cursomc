package com.example.cursomc.resoucers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está fuincionando!";
	}
}
