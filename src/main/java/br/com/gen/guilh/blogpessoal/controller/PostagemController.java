package br.com.gen.guilh.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gen.guilh.blogpessoal.model.Postagem;
import br.com.gen.guilh.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")

// 	Permitirá o recebimento de requisições realizadas de fora
//	do domínio (localhost e futuramente do heroku quando o deploy
//	for realizado) ao qual ela pertence. Essa anotação é essencial
//	aplicação (O termo técnico é consumir a API).
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){
		return ResponseEntity.ok(postagemRepository.findAll());
	}
	
	

}
