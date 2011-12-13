package panelen;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modellen.ModelManager;

public class InputPaneel extends JPanel{
	
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
}
