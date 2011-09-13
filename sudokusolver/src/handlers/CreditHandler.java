package handlers;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import modellen.ModelManager;
import eventHandlers.EventHandler;

public class CreditHandler implements EventHandler{

	private ModelManager modelmanager;
	
	private void creditPanel(){
		//custom title, no icon
		JOptionPane.showMessageDialog(null,
		    "It's not rocket science, it's just quantum physics",
		    "Copyleft Sander Demeester",
		    JOptionPane.PLAIN_MESSAGE);
	}
	
	@Override
	public void performEvent(ModelManager modelmanager, String actieCommand) {
		// TODO Auto-generated method stub
		this.modelmanager = modelmanager;
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				creditPanel();
			}
		});
	}

}
