package com.controleestoque.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.controleestoque.model.entity.Produto;
import com.controleestoque.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Produto salvar(@RequestBody Produto produto){
		return produtoService.salvar(produto);
	}
	
	@GetMapping("/{id}")
	public Produto buscarPorId(@PathVariable Integer id) {
		return produtoService.buscarPorId(id);
	}

}
