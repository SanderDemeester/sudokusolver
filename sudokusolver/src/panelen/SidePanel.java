package panelen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import modellen.ModelManager;
import eventHandlers.EventManager;

public class SidePanel extends JPanel{
	
	
	private JButton solveknop;
	private JButton resetknop;
	private JButton stapknop;
	private JButton inputwindowknop;
		
	
	public SidePanel(final ModelManager modelmanager,
					 final EventManager eventmanager){
		super();
		
		setBackground(Color.gray);
		setPreferredSize(new Dimension(200, 800));
		
		solveknop = new JButton("Solve");
		resetknop = new JButton("Reset");
		stapknop = new JButton("Stap");
		inputwindowknop = new JButton("Input window");
		
		solveknop.setActionCommand("solve");
		resetknop.setActionCommand("reset");
		stapknop.setActionCommand("stap");
		inputwindowknop.setActionCommand("inputwindow");
		
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
		
		inputwindowknop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				eventmanager.parseEvent(
						eventmanager.getEventNameMapping().get(e.getActionCommand())).performEvent(
								modelmanager,e.getActionCommand()
								);
				
			}
		});
		
		
		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateGaps(true);
		
		
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.CENTER)
					.addGroup(layout.createSequentialGroup()
							.addComponent(solveknop,25,25,25)
							.addComponent(resetknop,25,25,25)
							.addComponent(stapknop,25,25,25)
							.addComponent(inputwindowknop,25,25,25)
							)
							);
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGap(50)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
							.addComponent(solveknop,95,95,95)
							.addComponent(resetknop,95,95,95)
							.addComponent(stapknop,95,95,95)
							.addComponent(inputwindowknop,95,95,95)
							)
							);
	}

}
