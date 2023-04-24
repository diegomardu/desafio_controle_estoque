package com.controleestoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.controleestoque.dto.MovimentoEstoqueDto;
import com.controleestoque.model.entity.MovimentoEstoque;
import com.controleestoque.model.entity.Produto;
import com.controleestoque.model.repository.ProdutoRepository;
import com.controleestoque.model.repository.TipoMovimentacaoRepository;

@Service
public class MovimentoEstoqueservice {
	
	@Autowired
	private TipoMovimentacaoRepository repository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public MovimentoEstoque salvar(MovimentoEstoqueDto dto) {
		
		Produto produto = new Produto();
		produto = produtoRepository
				.findById(dto.getIdProduto())
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Produto não encontrado"));
		
		MovimentoEstoque estoque = new MovimentoEstoque();
		estoque.setDataMovimento(dto.getDataMovimento());
		estoque.setQuantidade(dto.getQuantidade());
		estoque.setTipoMovimentacao(dto.getTipoMovimentacao());
		estoque.setProduto(produto);
		
		return repository.save(estoque);
	}
	
	

}
