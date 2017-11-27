package br.edu.univas.si4.Concessionaria;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaConsulta extends JFrame{

	private static final long serialVersionUID = 5465465465L;
	
	private JPanel panel = null;
	
	public TelaConsulta(){
		this.setTitle("Tela Consulta");
		this.setSize(450, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		setContentPane();
		addComponent();
		
	}
	
	private void setContentPane() {
		panel = new JPanel();
		setContentPane(panel);
		
	}

	private void addComponent() {
		
		JLabel Labelname = new JLabel();
		Labelname.setText("Fabricante: ");
		panel.add(Labelname);
		
		JTextField TextFabricante = new JTextField();
		TextFabricante.setColumns(35);
		panel.add(TextFabricante);
		
		JLabel LabelColor = new JLabel();
		LabelColor.setText("Cor: ");
		panel.add(LabelColor);
		
		JTextField TextColor = new JTextField();
		TextColor.setColumns(20);
		panel.add(TextColor);
		
		JLabel LabelAno = new JLabel();
		LabelAno.setText("Ano: ");
		panel.add(LabelAno);
		
		JTextField TextAno = new JTextField();
		TextAno.setColumns(20);
		panel.add(TextAno);
	}

}
