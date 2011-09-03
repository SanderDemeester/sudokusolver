package panelen;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import modellen.ModelManager;
import eventHandlers.EventManager;

public class MainPaneel extends JPanel implements ChangeListener{
	
	private ModelManager modelmanager;
	private EventManager eventmanager;
	
	private JLabel label;
	
	public MainPaneel(ModelManager modelmanager,
						EventManager eventmanager){
		super();
		this.modelmanager = modelmanager;
		this.eventmanager = eventmanager;
		modelmanager.getModel(modelmanager.getMapModel().get("openfile")).addChangeListerner(this);
		setLayout(new BorderLayout());
		add(new SidePanel(modelmanager,eventmanager), BorderLayout.EAST);
		
		
		label = new JLabel("sudoku");
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		System.out.println("StateChanged in MainPaneel");
		add(label);
		repaint();
	}
	
	public void paint(Graphics g){
		super.paint(g); //altijd eerst super oproepen.
		Graphics2D g2 = (Graphics2D)g;
		 int x, y;
	        y = 50;
	        while (y <= 250)
	        {
	            g2.drawLine(50, y, 250, y);
	            y = y + 25;
	        }
	        x = 50;
	        while (x <= 250)
	        {
	            g2.drawLine(x, 50, x, 250);
	            x = x + 25;
	        }


	}

}
