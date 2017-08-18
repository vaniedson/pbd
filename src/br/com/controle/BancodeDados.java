package br.com.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


import br.com.model.beans.Funcionario;

public final class BancodeDados {


	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet= null;

	public void conectar(){
		String servidor = "jdbc:mysql://localhost:3306/pbd?useSSL=false";
		String usuario = "root";
		String senha ="arthur@123";
		String drive ="com.mysql.jdbc.Driver";

		try {
			Class.forName(drive);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			System.out.println("erro ao conec "+e);
			JOptionPane.showMessageDialog(null, "Erro ao gravar /n"+e);
		}
	}	
	public boolean estaConectado(){

		if(this.connection != null){
			return true;
		}
		else {
			return false;
		}
	}

	public void gravarFuncinario(Funcionario funcionario){

		try {
			String query= "INSERT INTO cliente (nome,matricula,cpf) values ('"+funcionario.getNome()+"',"+funcionario.getMatricula()+",'"+funcionario.getCpf()+"');";
			this.statement.executeUpdate(query);
		} catch (SQLException e) {
			System.err.println(e);
		}
	}

}



