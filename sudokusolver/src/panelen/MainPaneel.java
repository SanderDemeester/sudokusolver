package panelen;

import java.awt.BorderLayout;

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
		
		
	}

}
