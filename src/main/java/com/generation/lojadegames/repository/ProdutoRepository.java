package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);
	
	// Maior que X em ordem crescente 
    public List<Produto> findByPrecoGreaterThanOrderByPrecoAsc(BigDecimal preco);

    // Menor que X em ordem decrescente
    public List<Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);

}
