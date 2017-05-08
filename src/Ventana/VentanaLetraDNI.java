package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;


/*
 * By Paco Gomez
 * Esta ventana tendrá dos JTextFields
 * El primero recojerá el DNI
 * El segundo calculará la letra al apretar el botón
 * 
 * */
public class VentanaLetraDNI extends JFrame {

	private JPanel contentPane;
	private JTextField dni;
	private JTextField letra;
	private JButton btn_calcular;
	private Component verticalStrut;
	private Component verticalStrut_1;
	private Box horizontalBox;
	private Component horizontalGlue;
	private Component horizontalGlue_1;

	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Introduce DNI:");
		contentPane.add(lblNewLabel);
		
		dni = new JTextField();
		contentPane.add(dni);
		dni.setColumns(10);
		
		verticalStrut = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut);
		
		JLabel lblNewLabel_1 = new JLabel("Letra DNI calculada:");
		contentPane.add(lblNewLabel_1);
		
		letra = new JTextField();
		letra.setEditable(false);
		contentPane.add(letra);
		letra.setColumns(10);
		
		verticalStrut_1 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_1);
		
		horizontalBox = Box.createHorizontalBox();
		horizontalBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(horizontalBox);
		
		horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		btn_calcular = new JButton("Calcular");
		horizontalBox.add(btn_calcular);
		
		horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
	}
	
}
