package br.com.robson;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {
	
	private final AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/cadastro")
	public Cadastro cadastro () {
		
		return new Cadastro (contador.incrementAndGet(), "Robson", 29, "Desenvolvedor");
	}

}
