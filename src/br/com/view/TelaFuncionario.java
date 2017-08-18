package br.com.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import aplicaçao.App;
import br.com.model.beans.Funcionario;

import javax.swing.JButton;

public class TelaFuncionario extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button_1;

	public TelaFuncionario() {
		setSize(800, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblSistemaDeBiblioteca = new JLabel("SISTEMA DE BIBLIOTECA");
		lblSistemaDeBiblioteca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSistemaDeBiblioteca.setBounds(284, 11, 349, 39);
		getContentPane().add(lblSistemaDeBiblioteca);
		
		JLabel label = new JLabel("NOME");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(116, 150, 46, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("MATRICULA");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(116, 186, 78, 14);
		getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(224, 149, 488, 20);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(224, 180, 212, 20);
		getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("CPF");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(447, 186, 46, 14);
		getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(483, 180, 229, 20);
		getContentPane().add(textField_2);
		
		JButton button = new JButton("CANCELAR");
		button.setBounds(640, 410, 130, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("SALVAR");
		button_1.setBounds(483, 410, 141, 23);
		getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_1){
					
					int s = Integer.parseInt(textField_1.getText());
					Funcionario f = new Funcionario(textField.getText(), s, textField_2.getText());
					App.banco.gravarFuncinario(f);
					
				}
				
			}
		});
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new TelaFuncionario();
	}
	
}
