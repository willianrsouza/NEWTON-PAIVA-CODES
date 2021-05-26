package br.newton.poo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "funcionario")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String codigo;
	private String nome;
	private String cpf;
	private LocalDate dataAdm;
	private String cbo;

	public Funcionario(String codigo, String nome, String cpf, LocalDate dataAdm, String cbo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.dataAdm = dataAdm;
		this.cbo = cbo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataAdm() {
		return dataAdm;
	}

	public void setDataAdm(LocalDate dataAdm) {
		this.dataAdm = dataAdm;
	}

	public String getCbo() {
		return cbo;
	}

	public void setCbo(String cbo) {
		this.cbo = cbo;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", dataAdm="
				+ dataAdm + ", cbo=" + cbo + "]";
	}

}
