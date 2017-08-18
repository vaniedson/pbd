package br.com.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "funcionario")
public class Funcionario {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private String cpf;
	private int matricula;
	private String nome;


	public Funcionario(String nome, int matricula, String cpf) {
		this.nome=nome;
		this.matricula=matricula;
		this.cpf=cpf;

	}
	
	public Funcionario(int id, String nome, int matricula, String cpf) {
		super();
		this.id=id;
		this.nome=nome;
		this.matricula=matricula;
		this.cpf=cpf;

	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}



}
