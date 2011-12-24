package sudokusolver;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import menubalk.MenuBalk;
import modellen.GUIManager;
import modellen.ModelManager;
import panelen.MainPaneel;
import eventHandlers.EventManager;
public class Main {
	
	private static ModelManager modelmanager;
	private static EventManager eventmanager;
	
	public static void createGui(){
		
		
		GUIManager guimanager = new GUIManager();
		
		JFrame frame = new JFrame("sudoku solver");
		
		guimanager.setJFrame(frame);
		
		frame.setDefaultLookAndFeelDecorated(true);
		frame.setContentPane(new MainPaneel(modelmanager, eventmanager));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(800, 500));
		frame.pack();
		frame.setJMenuBar(new MenuBalk(modelmanager,eventmanager));
	}
	public static void main(String[] args){
		
		modelmanager = new ModelManager();
		eventmanager = new EventManager(modelmanager);
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				createGui();
			}
		});
	}

}
