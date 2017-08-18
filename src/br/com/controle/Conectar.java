package br.com.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conectar {
	
	private static Connection connection = null;
	private static Statement statement = null;
	private ResultSet resultSet= null;
	
	public static void conectar(){
		String servidor = "jdbc:mysql://localhost:3306/fbd_grafica?useSSL=false";
		String usuario = "root";
		String senha ="arthur@123";
		String drive ="com.mysql.jdbc.Driver";
		
		try {
			Class.forName(drive);
			connection = DriverManager.getConnection(servidor, usuario, senha);
			statement = connection.createStatement();
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

}
