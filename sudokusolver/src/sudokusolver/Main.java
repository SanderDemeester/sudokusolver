package sudokusolver;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import modellen.ModelManager;

import panelen.MainPaneel;

public class Main {
	
	public static void createGui(){
		JFrame frame = new JFrame("sudoku solver");
		frame.setDefaultLookAndFeelDecorated(true);
		frame.setContentPane(new MainPaneel(new ModelManager()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(800, 500));
		frame.pack();
		
		
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
