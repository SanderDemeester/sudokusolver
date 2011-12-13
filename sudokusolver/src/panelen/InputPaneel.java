package panelen;

import java.awt.Dimension;

import javax.swing.JPanel;

import modellen.ModelManager;

public class InputPaneel extends JPanel{
	
	private ModelManager modelmanager;
	
	public InputPaneel(ModelManager modelmanager){
		super();
		this.modelmanager = modelmanager;
//		setBackground(Colo)
		setPreferredSize(new Dimension(200,200));
	}

}
