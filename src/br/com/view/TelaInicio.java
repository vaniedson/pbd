package br.com.view;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaInicio extends JFrame{
	private JTextField textField;
	private JTable table;
	
	
	public TelaInicio(){
		
		setSize(800, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setToolTipText("");
		btnLogin.setBounds(522, 426, 126, 35);
		getContentPane().add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(10, 104, 573, 35);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(612, 104, 172, 35);
		getContentPane().add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 774, 265);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBounds(10, 62, 1, 1);
		getContentPane().add(table);
		
		JLabel lblConsultarAcervo = new JLabel("CONSULTAR ACERVO");
		lblConsultarAcervo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConsultarAcervo.setBounds(10, 70, 251, 38);
		getContentPane().add(lblConsultarAcervo);
		
		JLabel lblSistemaDeBiblioteca = new JLabel("SISTEMA DE BIBLIOTECA");
		lblSistemaDeBiblioteca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSistemaDeBiblioteca.setBounds(306, 27, 275, 35);
		getContentPane().add(lblSistemaDeBiblioteca);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setBounds(658, 425, 126, 35);
		getContentPane().add(btnSair);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new TelaInicio();
	}
}
