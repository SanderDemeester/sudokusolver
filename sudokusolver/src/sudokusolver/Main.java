package sudokusolver;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import menubalk.MenuBalk;
import modellen.ModelManager;
import panelen.MainPaneel;
public class Main {
	
	public static void createGui(){
		ModelManager modelmanager = new ModelManager();
		
		JFrame frame = new JFrame("sudoku solver");
		frame.setDefaultLookAndFeelDecorated(true);
		frame.setContentPane(new MainPaneel(modelmanager));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(800, 500));
		frame.pack();
		frame.setJMenuBar(new MenuBalk(modelmanager));
	}
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				createGui();
			}
		});
	}

}
