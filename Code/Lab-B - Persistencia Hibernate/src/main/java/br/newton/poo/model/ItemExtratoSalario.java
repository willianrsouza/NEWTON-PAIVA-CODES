package br.newton.poo.model;

import javax.persistence.*;

@Entity
@Table(name = "ItemExtratoSalario")
public class ItemExtratoSalario {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cod;
	private String descricao;
	private String ref;
	private float valor;

	public ItemExtratoSalario(String descricao, String ref, float valor) {
		super();
		this.descricao = descricao;
		this.ref = ref;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Integer getCod() {
		return cod;
	}

}
