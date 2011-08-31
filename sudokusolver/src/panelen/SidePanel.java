package panelen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import modellen.ModelManager;
import eventHandlers.EventManager;

public class SidePanel extends JPanel{
	
	private ModelManager modelmanager;
	private EventManager eventmanger;
	
	private JButton solveknop;
	private JButton resetknop;
	
	public SidePanel(final ModelManager modelmanager,
					 final EventManager eventmanager){
		super();
		
		this.modelmanager = modelmanager;
		setBackground(Color.red);
		setPreferredSize(new Dimension(200, 800));
		
		solveknop = new JButton("Solve");
		resetknop = new JButton("Reset");
		
		resetknop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				modelmanager.getModel(modelmanager.getMapModel().get("reset")).actionPerformed(e);
				
			}
		});
		
		solveknop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				modelmanager.getModel(modelmanager.getMapModel().get("solve")).actionPerformed(e);
			}
		});
		add(solveknop);
		add(resetknop);
		
	}

}
