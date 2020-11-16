package tankstelle;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class tankanzeige extends JFrame
{

	private JPanel contentPane;
	private JLabel labelTankanzeige;
	private JLabel labelDiesel;
	private JLabel labelSuper;
	private JLabel labelSuperPlus;
	private JSlider sliderDiesel;
	private JSlider sliderSuper;
	private JSlider sliderSuperPlus;

	/**
	 * Launch the application.
	 */
	private Controller c;
	private JButton buttonKaufen;
	private JLabel labelDieselPreis;
	private JLabel labelSuperPreis;
	private JLabel labelSuperPlusPreis;
	
	public tankanzeige(Controller c) 
	{
		initialize();
		this.c = c;
	}
	/**
	 * Create the frame.
	 */
	private void initialize() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabelTankanzeige());
		contentPane.add(getLabelDiesel());
		contentPane.add(getLabelSuper());
		contentPane.add(getLabelSuperPlus());
		contentPane.add(getSliderDiesel());
		contentPane.add(getSliderSuper());
		contentPane.add(getSliderSuperPlus());
		contentPane.add(getButtonKaufen());
		contentPane.add(getLabelDieselPreis());
		contentPane.add(getLabelSuperPreis());
		contentPane.add(getLabelSuperPlusPreis());
	}
	private JLabel getLabelTankanzeige() {
		if (labelTankanzeige == null) {
			labelTankanzeige = new JLabel("Tankanzeige");
			labelTankanzeige.setFont(new Font("Tahoma", Font.PLAIN, 24));
			labelTankanzeige.setBounds(10, 11, 210, 39);
		}
		return labelTankanzeige;
	}
	private JLabel getLabelDiesel() {
		if (labelDiesel == null) {
			labelDiesel = new JLabel("Diesel");
			labelDiesel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			labelDiesel.setBounds(10, 66, 115, 29);
		}
		return labelDiesel;
	}
	private JLabel getLabelSuper() {
		if (labelSuper == null) {
			labelSuper = new JLabel("Super");
			labelSuper.setFont(new Font("Tahoma", Font.PLAIN, 18));
			labelSuper.setBounds(10, 106, 115, 29);
		}
		return labelSuper;
	}
	private JLabel getLabelSuperPlus() {
		if (labelSuperPlus == null) {
			labelSuperPlus = new JLabel("SuperPlus\r\n");
			labelSuperPlus.setFont(new Font("Tahoma", Font.PLAIN, 18));
			labelSuperPlus.setBounds(10, 146, 115, 29);
		}
		return labelSuperPlus;
	}
	protected JSlider getSliderDiesel() {
		if (sliderDiesel == null) {
			sliderDiesel = new JSlider();
			sliderDiesel.setValue(100);
			sliderDiesel.setMaximum(200);
			sliderDiesel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			sliderDiesel.setBounds(127, 66, 459, 26);
		}
		return sliderDiesel;
	}
	protected JSlider getSliderSuper() {
		if (sliderSuper == null) {
			sliderSuper = new JSlider();
			sliderSuper.setValue(100);
			sliderSuper.setMaximum(200);
			sliderSuper.setFont(new Font("Tahoma", Font.PLAIN, 18));
			sliderSuper.setBounds(127, 109, 459, 26);
		}
		return sliderSuper;
	}
	protected JSlider getSliderSuperPlus() {
		if (sliderSuperPlus == null) {
			sliderSuperPlus = new JSlider();
			sliderSuperPlus.setValue(100);
			sliderSuperPlus.setMaximum(200);
			sliderSuperPlus.setFont(new Font("Tahoma", Font.PLAIN, 18));
			sliderSuperPlus.setBounds(127, 149, 459, 26);
		}
		return sliderSuperPlus;
	}
	private JButton getButtonKaufen() {
		if (buttonKaufen == null) {
			buttonKaufen = new JButton("Kaufen");
			buttonKaufen.setFont(new Font("Tahoma", Font.PLAIN, 18));
			buttonKaufen.setBounds(388, 197, 127, 44);
		}
		return buttonKaufen;
	}
	protected JLabel getLabelDieselPreis() {
		if (labelDieselPreis == null) {
			labelDieselPreis = new JLabel(String.valueOf(sliderDiesel.getValue()/100));
			labelDieselPreis.setFont(new Font("Tahoma", Font.PLAIN, 18));
			labelDieselPreis.setBounds(599, 66, 115, 29);
		}
		return labelDieselPreis;
	}
	protected JLabel getLabelSuperPreis() {
		if (labelSuperPreis == null) {
			labelSuperPreis = new JLabel(String.valueOf(sliderSuper.getValue()/100));
			labelSuperPreis.setFont(new Font("Tahoma", Font.PLAIN, 18));
			labelSuperPreis.setBounds(599, 106, 115, 29);
		}
		return labelSuperPreis;
	}
	protected JLabel getLabelSuperPlusPreis() {
		if (labelSuperPlusPreis == null) {
			labelSuperPlusPreis = new JLabel(String.valueOf(sliderSuperPlus.getValue()/100));
			labelSuperPlusPreis.setFont(new Font("Tahoma", Font.PLAIN, 18));
			labelSuperPlusPreis.setBounds(599, 146, 115, 29);
		}
		return labelSuperPlusPreis;
	}
}
