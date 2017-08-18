package br.com.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;

public class TelaUsuario extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	
	public TelaUsuario() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		setSize(800, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblSistemaDeBiblioteca = new JLabel("SISTEMA DE BIBLIOTECA");
		lblSistemaDeBiblioteca.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSistemaDeBiblioteca.setBounds(291, 24, 264, 35);
		getContentPane().add(lblSistemaDeBiblioteca);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(102, 111, 46, 14);
		getContentPane().add(lblNome);
		
		JLabel lblMatricula = new JLabel("MATRICULA");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMatricula.setBounds(102, 147, 78, 14);
		getContentPane().add(lblMatricula);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(433, 147, 46, 14);
		getContentPane().add(lblCpf);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(102, 173, 78, 14);
		getContentPane().add(lblTelefone);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(102, 264, 46, 14);
		getContentPane().add(lblEmail);
		
		JLabel lblEndereo = new JLabel("ENDERE\u00C7O");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEndereo.setBounds(80, 300, 100, 14);
		getContentPane().add(lblEndereo);
		
		JLabel lblDadosPessoais = new JLabel("DADOS PESSOAIS");
		lblDadosPessoais.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDadosPessoais.setBounds(80, 79, 168, 14);
		getContentPane().add(lblDadosPessoais);
		
		textField = new JTextField();
		textField.setBounds(210, 110, 488, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 141, 212, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(210, 172, 168, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(210, 258, 488, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(469, 141, 229, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.setBounds(593, 171, 105, 23);
		getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(210, 200, 168, 51);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(80, 96, 665, 193);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("RUA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(102, 341, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblN = new JLabel("N\u00BA ");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN.setBounds(477, 342, 46, 14);
		getContentPane().add(lblN);
		
		JLabel lblBairro = new JLabel("BAIRRO");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBairro.setBounds(553, 341, 78, 14);
		getContentPane().add(lblBairro);
		
		JLabel lblCidade = new JLabel("CIDADE");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCidade.setBounds(102, 381, 68, 14);
		getContentPane().add(lblCidade);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUf.setBounds(476, 381, 29, 14);
		getContentPane().add(lblUf);
		
		JLabel lblPais = new JLabel("PA\u00CDS");
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPais.setBounds(553, 381, 46, 14);
		getContentPane().add(lblPais);
		
		textField_6 = new JTextField();
		textField_6.setBounds(210, 340, 257, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(497, 341, 46, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(605, 341, 93, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(210, 375, 257, 20);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(497, 375, 46, 20);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(593, 375, 105, 20);
		getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(80, 325, 665, 90);
		getContentPane().add(panel_1);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(615, 437, 130, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(458, 437, 141, 23);
		getContentPane().add(btnSalvar);
		
		JRadioButton rdbtnProfessor = new JRadioButton("PROFESSOR");
		rdbtnProfessor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnProfessor.setBounds(560, 70, 109, 23);
		getContentPane().add(rdbtnProfessor);
		
		JRadioButton rdbtnAluno = new JRadioButton("ALUNO");
		rdbtnAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnAluno.setBounds(679, 70, 109, 23);
		getContentPane().add(rdbtnAluno);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TelaUsuario();
	}
}
