package com.controleestoque.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.controleestoque.dto.MovimentoEstoqueDto;
import com.controleestoque.model.entity.MovimentoEstoque;
import com.controleestoque.service.MovimentoEstoqueservice;

@RestController
@RequestMapping("/movimento-estoque")
public class MovimentoEstoqueController {

	@Autowired
	private MovimentoEstoqueservice service;
		
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MovimentoEstoque salvar(@RequestBody MovimentoEstoqueDto dto) {
		return service.salvar(dto);
	}
	
}
