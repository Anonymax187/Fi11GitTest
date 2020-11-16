package tankstelle;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controller 
{
	private tankanzeige gui;

	public Controller()
	{
		this.gui = new tankanzeige(this);
		gui.setVisible(true);
		erzeugeEventListener();
	}
	
	public void erzeugeEventListener()
	{
		class DieselPreisListener implements ChangeListener
		{
			@Override
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				gui.getLabelDieselPreis().setText(String.valueOf((double)source.getValue()/100));
			}
		}
	
		class SuperPreisListener implements ChangeListener
		{
			@Override
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				gui.getLabelSuperPreis().setText(String.valueOf((double)source.getValue()/100));
			}
		}
		
		class SuperPlusPreisListener implements ChangeListener
		{
			@Override
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				gui.getLabelSuperPlusPreis().setText(String.valueOf((double)source.getValue()/100));
			}
		}
		
		gui.getSliderDiesel().addChangeListener(new DieselPreisListener());
		gui.getSliderSuper().addChangeListener(new SuperPreisListener());
		gui.getSliderSuperPlus().addChangeListener(new SuperPlusPreisListener());
	}
}
