package br.rj.senac.exemplojwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}
