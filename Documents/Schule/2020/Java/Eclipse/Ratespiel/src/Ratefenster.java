import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ratefenster {

	private JFrame frmRatespiel;
	private JTextField textEingabe;
	private JLabel labelRatespiel;
	private JLabel rateSpielErgebnis;
	private JButton buttonRaten;
	private JLabel labelErgebnis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try
				{
					Ratefenster window = new Ratefenster();
					window.frmRatespiel.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});	
	}

	/**
	 * Create the application.
	 */
	public Ratefenster() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmRatespiel = new JFrame();
		frmRatespiel.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmRatespiel.setTitle("Ratespiel");
		frmRatespiel.setBounds(100, 100, 357, 198);
		frmRatespiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRatespiel.getContentPane().setLayout(null);
		frmRatespiel.getContentPane().add(getTextEingabe());
		frmRatespiel.getContentPane().add(getLabelRatespiel());
		frmRatespiel.getContentPane().add(getRateSpielErgebnis());
		frmRatespiel.getContentPane().add(getButtonRaten());
		frmRatespiel.getContentPane().add(getLabelErgebnis());
	}
	private JTextField getTextEingabe() 
	{
		if (textEingabe == null) 
		{
			textEingabe = new JTextField();
			textEingabe.setText("Zahl Eingeben");
			textEingabe.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textEingabe.setBounds(10, 68, 143, 45);
			textEingabe.setColumns(10);
		}
		return textEingabe;
	}
	private JLabel getLabelRatespiel() 
	{
		if (labelRatespiel == null) 
		{
			labelRatespiel = new JLabel("Ratespiel Zwischen 1 und 10.");
			labelRatespiel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelRatespiel.setBounds(95, 31, 192, 20);
		}
		return labelRatespiel;
	}
	private JLabel getRateSpielErgebnis() 
	{
		if (rateSpielErgebnis == null) 
		{
			rateSpielErgebnis = new JLabel("");
			rateSpielErgebnis.setBounds(107, 155, 46, 14);
		}
		return rateSpielErgebnis;
	}
	private JButton getButtonRaten()
	{
		if (buttonRaten == null)
		{
			buttonRaten = new JButton("Raten");
			buttonRaten.setFont(new Font("Tahoma", Font.PLAIN, 14));
			buttonRaten.setBounds(163, 68, 140, 45);
		}
		
		DerHandler handler = new DerHandler();
		buttonRaten.addActionListener(handler);
		
		return buttonRaten;
	}
	
	private class DerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource()==buttonRaten)
				geraten();
		}
		
	}
	
	private JLabel getLabelErgebnis() {
		if (labelErgebnis == null) {
			labelErgebnis = new JLabel("");
			labelErgebnis.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelErgebnis.setBounds(10, 124, 321, 29);
		}
		return labelErgebnis;
	}
	
	public void geraten()
	{
		int eingabe = Integer.parseInt(textEingabe.getText());
		textEingabe.setText("");
		int zufallszahl = (int) (Math.random() * 10 + 1);
		
		if(eingabe == zufallszahl)
		{
			labelErgebnis.setText("Sie haben Gewonnen!!");
		}
		else
		{
			labelErgebnis.setText("Sie haben eine Falsche Zahl angegeben.");
		}
	}
	
	
}
