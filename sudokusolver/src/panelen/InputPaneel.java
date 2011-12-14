package panelen;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modellen.ModelEnum;
import modellen.ModelManager;
import modellen.SudokuGrid;

public class InputPaneel extends JPanel implements WindowListener{
	
	private ModelManager modelmanager;
	
	JTextField[][] visual_matrix;
	
	public InputPaneel(ModelManager modelmanager){
		super();
		this.modelmanager = modelmanager;
		setPreferredSize(new Dimension(600,400));
		setLayout(new GridLayout(9,9));
		
		visual_matrix = new JTextField[9][9];
		
		visual_matrix[1][1] = new JTextField(1);
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
			visual_matrix[i][j] = new JTextField(5);
			visual_matrix[i][j].setFont(new Font("Verdana",Font.BOLD,45));
			visual_matrix[i][j].setSize(5, 5);
			add(visual_matrix[i][j]);	
			}
		}
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("test test");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[9][9];
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				matrix[i][j] = visual_matrix[i][j].toString();
			}
			
			}
		
		((SudokuGrid)modelmanager.getModel(ModelEnum.sudokugrid)).setGrid(matrix);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
