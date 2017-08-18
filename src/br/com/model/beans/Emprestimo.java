package br.com.model.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private Date dtPrevRetorno;
	private Date dtEmprestimo;
	
	public Emprestimo() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDtPrevRetorno() {
		return dtPrevRetorno;
	}

	public void setDtPrevRetorno(Date dtPrevRetorno) {
		this.dtPrevRetorno = dtPrevRetorno;
	}

	public Date getDtEmprestimo() {
		return dtEmprestimo;
	}

	public void setDtEmprestimo(Date dtEmprestimo) {
		this.dtEmprestimo = dtEmprestimo;
	}

}
