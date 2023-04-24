package com.controleestoque.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controleestoque.model.entity.MovimentoEstoque;

@Repository
public interface TipoMovimentacaoRepository extends JpaRepository<MovimentoEstoque, Integer> {

}
