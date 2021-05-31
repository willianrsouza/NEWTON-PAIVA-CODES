package br.newton.poo.model;

import javax.persistence.*;

@Entity
@Table(name="cargo")
public class Cargo {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	private float salarioBaseHora;

	public Cargo(String nome, float salarioBaseHora) {
		super();
		this.nome = nome;
		this.salarioBaseHora = salarioBaseHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalarioBaseHora() {
		return salarioBaseHora;
	}

	public void setSalarioBaseHora(float salarioBaseHora) {
		this.salarioBaseHora = salarioBaseHora;
	}

	public Integer getId() {
		return id;
	}

}
