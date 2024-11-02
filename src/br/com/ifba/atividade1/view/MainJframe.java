package br.com.ifba.atividade1.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainJframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJframe frame = new MainJframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainJframe() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinnerAno = new JSpinner();
		spinnerAno.setBounds(189, 100, 69, 20);
		contentPane.add(spinnerAno);
		
		JLabel lblNewLabel = new JLabel("Ano de nascimento:");
		lblNewLabel.setBounds(34, 103, 145, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainJframe.class.getResource("/br/com/ifba/atividade1/images/homem.png")));
		lblNewLabel_1.setBounds(243, 0, 305, 327);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblinutil = new JLabel("Sua idade:");
		lblinutil.setBounds(34, 241, 159, 14);
		contentPane.add(lblinutil);
		
		JLabel lblIdade = new JLabel("00");
		lblIdade.setForeground(new Color(255, 0, 0));
		lblIdade.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIdade.setBounds(106, 224, 93, 46);
		contentPane.add(lblIdade);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// recebo o valor do Spinner
				int anoDeNascimento = (int) spinnerAno.getValue();
				// ano atual
				int anoAtual = 2024;
				// idade
				int idade = (anoAtual - anoDeNascimento);
				// formato a idade como texto
				String idadeFormatada = Integer.toString(idade);
				// passo a idadade
				lblIdade.setText(idadeFormatada);
			}
		});
		btnCalcular.setSelectedIcon(new ImageIcon(MainJframe.class.getResource("/br/com/ifba/atividade1/images/calculadora.png")));
		btnCalcular.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCalcular.setIcon(new ImageIcon(MainJframe.class.getResource("/br/com/ifba/atividade1/images/calculadora.png")));
		btnCalcular.setBounds(33, 163, 120, 36);
		contentPane.add(btnCalcular);
	}
}
