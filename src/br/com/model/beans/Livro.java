package br.com.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private int anoPublicacao;
	private String titulo;
	private int numEdicao;
	private int quantExemplares;
	private String editora;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumEdicao() {
		return numEdicao;
	}

	public void setNumEdicao(int numEdicao) {
		this.numEdicao = numEdicao;
	}

	public int getQuantExemplares() {
		return quantExemplares;
	}

	public void setQuantExemplares(int quantExemplares) {
		this.quantExemplares = quantExemplares;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

}
