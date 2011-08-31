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
	
	
	private JButton solveknop;
	private JButton resetknop;
	private JButton stapknop;
	
	public SidePanel(final ModelManager modelmanager,
					 final EventManager eventmanager){
		super();
		
		setBackground(Color.red);
		setPreferredSize(new Dimension(200, 800));
		
		solveknop = new JButton("Solve");
		resetknop = new JButton("Reset");
		stapknop = new JButton("Stap");
		solveknop.setActionCommand("solve");
		resetknop.setActionCommand("reset");
		stapknop.setActionCommand("stap");
		
		resetknop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				// TODO Auto-generated method stub
				eventmanager.parseEvent(
						eventmanager.getEventNameMapping().get(e.getActionCommand())).performEvent(
								modelmanager,e.getActionCommand()
								);
				//modelmanager.getModel(modelmanager.getMapModel().get("reset")).actionPerformed(e);
				
			}
		});
		
		solveknop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//modelmanager.getModel(modelmanager.getMapModel().get("solve")).actionPerformed(e);
				eventmanager.parseEvent(
						eventmanager.getEventNameMapping().get(e.getActionCommand())).performEvent(
								modelmanager,e.getActionCommand()
								);
			}
		});
		
		stapknop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				eventmanager.parseEvent(
						eventmanager.getEventNameMapping().get(e.getActionCommand())).performEvent(
								modelmanager,e.getActionCommand()
								);
				
			}
		});
		add(solveknop);
		add(resetknop);
		add(stapknop);
		
	}

}
