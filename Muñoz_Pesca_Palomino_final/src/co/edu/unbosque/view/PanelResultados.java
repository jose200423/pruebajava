package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{
	
	private JTextArea eresult;
	
	
	
    public PanelResultados() {
		
    	setLayout(new BorderLayout()); //diseño 
		setBackground(Color.WHITE);
		setBorder(new TitledBorder("Panel de Resultados"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		eresult = new JTextArea();
		eresult.setEditable(false);// configuracion si se puede escribir
		JScrollPane pscroll = new JScrollPane(eresult, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(pscroll, BorderLayout.CENTER);
		
	}

	public JTextArea getEresult() {
		return eresult;
	}

	public void setEresult(JTextArea eresult) {
		this.eresult = eresult;
	}

}
