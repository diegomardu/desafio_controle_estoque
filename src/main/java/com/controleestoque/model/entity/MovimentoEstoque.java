package com.controleestoque.model.entity;

import java.util.Date;
import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_movimento_estoque")
public class MovimentoEstoque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date dataMovimento;
	private Integer quantidade;
	private TipoMovimentacao tipoMovimentacao;
	
	@ManyToOne
	private Produto produto;
	
	

}
