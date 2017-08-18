package br.com.view;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class TelaLogin extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	
	public TelaLogin() {
		
		setSize(400, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(142, 85, 198, 27);
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(142, 126, 198, 27);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(142, 164, 198, 27);
		getContentPane().add(passwordField);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(77, 130, 46, 14);
		getContentPane().add(lblCpf);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(77, 168, 46, 14);
		getContentPane().add(lblSenha);
		
		JLabel lblUsurio = new JLabel("USU\u00C1RIO");
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsurio.setBounds(75, 89, 95, 14);
		getContentPane().add(lblUsurio);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(164, 236, 89, 23);
		getContentPane().add(btnEntrar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(265, 236, 89, 23);
		getContentPane().add(btnCancelar);
		
		JLabel lblSistemaDeBiblioteca = new JLabel("SISTEMA DE BIBLIOTECA");
		lblSistemaDeBiblioteca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSistemaDeBiblioteca.setBounds(100, 34, 226, 14);
		getContentPane().add(lblSistemaDeBiblioteca);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaLogin();
	}
}