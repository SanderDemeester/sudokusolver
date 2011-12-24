package panelen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
				final int ii = i;
				final int jj = j;
					
			visual_matrix[i][j] = new JTextField(5);
			visual_matrix[i][j].setFont(new Font("Verdana",Font.BOLD,45));
			visual_matrix[i][j].addKeyListener(new KeyAdapter() {
				public void KeyPressed(KeyEvent event){
					String value = visual_matrix[ii][jj].getText();
					int l = value.length();
					if(event.getKeyChar() >= '0' && event.getKeyChar() <= '9'){
						visual_matrix[ii][jj].setEditable(true);
						visual_matrix[ii][jj].setText("");
					}else{
						visual_matrix[ii][jj].setEditable(false);
						visual_matrix[ii][jj].setText("");
						JOptionPane.showMessageDialog(null,"Enkel getallen tussen 0 en 9 zijn toegelaten",
													null,JOptionPane.ERROR_MESSAGE);
						
					}
					
				}
			});
			if((i >= 3 && j >= 3) && i < 6 && j < 6)
				visual_matrix[i][j].setBackground(Color.gray);
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
		int[][] matrix = new int[9][9];
			
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				if(!visual_matrix[i][j].getText().isEmpty()){
					matrix[i][j] = Integer.parseInt(visual_matrix[i][j].getText().toString());
				}
			}
			
			}
		
		((SudokuGrid)modelmanager.getModel(ModelEnum.sudokugrid)).setGrid(matrix);
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
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
