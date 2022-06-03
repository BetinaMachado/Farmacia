package com.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo é de preenchimento obrigatório e não aceita apenas espaços em branco.")
	@Size(min = 5, max = 40, message = "O atributo aceita no mínimo 5 e no máximo 40 caracteres.")
	private String nome;

	@NotNull(message = "O atributo é de preenchimento obrigatório e não aceita apenas espaços em branco.")
	@Digits(integer = 4, fraction = 2, message = "No máximo milhares e 2 casas após o ponto.")
	private BigDecimal preco;

	@NotBlank(message = "O atributo é de preenchimento obrigatório e não aceita apenas espaços em branco.")
	@Size(min = 3, max = 40, message = "O atributo aceita no mínimo 3 e no máximo 40 caracteres.")
	private String laboratorio;

	@NotBlank(message = "O atributo é de preenchimento obrigatório e não aceita apenas espaços em branco.")
	@Size(min = 5, max = 500, message = "O atributo aceita no mínimo 5 e no máximo 500 caracteres.")
	private String descricao;

	@NotNull(message = "O atributo é de preenchimento obrigatório.")
	private int quantidade;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
