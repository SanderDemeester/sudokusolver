package handlers;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import panelen.InputPaneel;
import panelen.MainPaneel;
import menubalk.MenuBalk;
import modellen.ModelManager;
import eventHandlers.EventHandler;

public class InputWindow implements EventHandler{
	
		
	@Override
	public void performEvent(ModelManager modelmanager, String actieCommand) {
		// TODO Auto-generated method stub
		System.out.println("EventPerformed vanuitinput window");
	}

}
