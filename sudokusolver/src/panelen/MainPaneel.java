package panelen;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import modellen.ModelManager;
import eventHandlers.EventManager;

public class MainPaneel extends JPanel{
	
	private ModelManager modelmanager;
	private EventManager eventmanager;
	
	public MainPaneel(ModelManager modelmanager,
						EventManager eventmanger){
		super();
		this.modelmanager = modelmanager;
		setLayout(new BorderLayout());
		add(new SidePanel(modelmanager,eventmanager), BorderLayout.EAST);
	}

}
