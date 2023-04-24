package com.controleestoque.dto;

import java.util.Date;

import com.controleestoque.model.entity.TipoMovimentacao;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovimentoEstoqueDto {
	
	private Date dataMovimento;
	private Integer quantidade;
	private TipoMovimentacao tipoMovimentacao;
	private Integer idProduto;

}
