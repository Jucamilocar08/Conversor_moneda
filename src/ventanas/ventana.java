package ventanas;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ventana extends JFrame{
	
	Image iconImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\eclipse-workspace\\conversor.moneda\\icont.png");
	
	public ventana() {
		this.setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Menu");
		setIconImage(iconImage);
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		panel();
		boton();
		
	}

	private void panel() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}
	
	public void boton() {
		JButton boton1 = new JButton();
		boton1.setText("Click");
		boton1.setBounds(100, 100, 100, 40);
		panel.add(boton1);

		this.setContentPane(panel);

	}
}
