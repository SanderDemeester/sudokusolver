package panelen;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import modellen.ModelManager;

public class MainPaneel extends JPanel{
	
	private ModelManager modelmanager;
	
	public MainPaneel(ModelManager modelmanager){
		super();
		this.modelmanager = modelmanager;
		setLayout(new BorderLayout());
		add(new SidePanel(), BorderLayout.EAST);
	}

}
