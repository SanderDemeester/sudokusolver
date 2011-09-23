package panelen;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import modellen.ModelEnum;
import modellen.ModelManager;
import modellen.SudokuGrid;
import eventHandlers.EventManager;

public class MainPaneel extends JPanel implements ChangeListener{
	
	private ModelManager modelmanager;
	private EventManager eventmanager;
	private SudokuGrid gridmodel;
	
	private Font Font1 = new Font("Long Island",Font.BOLD,30);
	
	private JLabel label;
	
	public MainPaneel(ModelManager modelmanager,
						EventManager eventmanager){
		super();
		this.modelmanager = modelmanager;
		this.eventmanager = eventmanager;
		gridmodel = (SudokuGrid)modelmanager.getModel(ModelEnum.sudokugrid);
		
		modelmanager.getModel(modelmanager.getMapModel().get("openfile")).addChangeListerner(this);
		setLayout(new BorderLayout());
		add(new SidePanel(modelmanager,eventmanager), BorderLayout.EAST);
		
		
		label = new JLabel("sudoku");
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	
	public void paint(Graphics g){
		
		
		super.paint(g); //altijd eerst super oproepen.
		Graphics2D g2 = (Graphics2D)g; //een Graphics2D om gewone lijnen mee te tekennen.
		
		int x, y;
		 y = 50;
		 while (y <= 450)
		 {
			 g2.drawLine(50, y, 410, y);
			 y = y + 40;
	        }	
	        x = 50;
	        while (x <= 420)
	        {
	            g2.drawLine(x, 50, x, 410);
	            x = x + 40;
	        }
	        
	        if(!gridmodel.fileloaded())
	        	paintSymbolGrid(g2);	
	        
	       
	}
	
	private void paintSymbolGrid(Graphics2D g2){
		/**60 is de start pos op x-as voor het eerste symbool
		 * 80 is de start pos op de y-as voor het eerste symbool */
		int marge = 40; /*dit het aantal dat moet worden verplaats op de x of de y as om het volgende 
		symbool te kunnen/mogen tekennen.*/
		int tekenposX = 60;
		int tekenposY = 80;
		
		int grid[][] = gridmodel.getGrid();
		String temp;
		
		g2.setFont(Font1);
		
		 for(int i = 0; i < 9; ++i){
	        	for(int j = 0; j < 9; ++j){
	        		if(grid[i][j] != 0){
	        			g2.drawString(((Integer)grid[i][j]).toString(), tekenposX, tekenposY);
	        		}
	        		tekenposX += marge;
	        	}
	        	tekenposY += marge;
	        	tekenposX = 60;
	        }
	}

}
