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
		JFrame frame = new JFrame("Input window");
		frame = new JFrame("2de window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(new InputPaneel(modelmanager));
		frame.setResizable(false);
		frame.pack();
		
	}
	@Override
	public void performEvent(ModelManager modelmanager, String actieCommand) {
		// TODO Auto-generated method stub
		System.out.println("EventPerformed vanuitinput window");
		createGUI(modelmanager);
		
	}

}
