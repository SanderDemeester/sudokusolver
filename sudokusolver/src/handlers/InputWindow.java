package handlers;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import panelen.InputPaneel;
import panelen.MainPaneel;
import menubalk.MenuBalk;
import modellen.GUIManager;
import modellen.ModelManager;
import eventHandlers.EventHandler;

public class InputWindow implements EventHandler{
	
		
	static void createGUI(ModelManager modelmanager){
		InputPaneel p = new InputPaneel(modelmanager);
		JFrame frame = new JFrame("Input window");
		frame = new JFrame("2de window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(p);
		frame.setResizable(false);
		frame.pack();
		frame.addWindowListener(p);
		
	}
	@Override
	public void performEvent(ModelManager modelmanager, String actieCommand) {
		// TODO Auto-generated method stub
		createGUI(modelmanager);
		
	}

}
