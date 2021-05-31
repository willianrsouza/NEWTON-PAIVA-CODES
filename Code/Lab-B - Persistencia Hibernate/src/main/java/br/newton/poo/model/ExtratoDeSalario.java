package br.newton.poo.model;

import java.sql.Date;
import java.time.Month;

import javax.persistence.*;

@Entity
@Table(name = "ExtratoDeSalario")
public class ExtratoDeSalario {

	private Date data;
	private Month mes;
	private float totalComDesconto;
	private float totalSemDesconto;
	private float horasTrabalhadas;
	private float horasFalta;
	private String irpf;
	private String inss;

	public ExtratoDeSalario(Date data, Month mes, float totalComDesconto, float totalSemDesconto,
			float horasTrabalhadas, float horasFalta, String irpf, String inss) {
		super();
		this.data = data;
		this.mes = mes;
		this.totalComDesconto = totalComDesconto;
		this.totalSemDesconto = totalSemDesconto;
		this.horasTrabalhadas = horasTrabalhadas;
		this.horasFalta = horasFalta;
		this.irpf = irpf;
		this.inss = inss;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Month getMes() {
		return mes;
	}

	public void setMes(Month mes) {
		this.mes = mes;
	}

	public float getTotalComDesconto() {
		return totalComDesconto;
	}

	public void setTotalComDesconto(float totalComDesconto) {
		this.totalComDesconto = totalComDesconto;
	}

	public float getTotalSemDesconto() {
		return totalSemDesconto;
	}

	public void setTotalSemDesconto(float totalSemDesconto) {
		this.totalSemDesconto = totalSemDesconto;
	}

	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public float getHorasFalta() {
		return horasFalta;
	}

	public void setHorasFalta(float horasFalta) {
		this.horasFalta = horasFalta;
	}

	public String getIrpf() {
		return irpf;
	}

	public void setIrpf(String irpf) {
		this.irpf = irpf;
	}

	public String getInss() {
		return inss;
	}

	public void setInss(String inss) {
		this.inss = inss;
	}

}
