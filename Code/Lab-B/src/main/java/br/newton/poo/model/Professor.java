package br.newton.poo.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String matricula;
	private String formacao;
	private Date dataNasc;

	public Professor(String matricula, String formacao, Date dataNasc) {
		super();
		this.matricula = matricula;
		this.formacao = formacao;
		this.dataNasc = dataNasc;
	}

	public Integer getId() {
		return id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", matricula=" + matricula + ", formacao=" + formacao + ", dataNasc=" + dataNasc
				+ "]";
	}

}
