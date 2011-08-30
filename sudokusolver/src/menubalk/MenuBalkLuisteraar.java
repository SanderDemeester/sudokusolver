package menubalk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import modellen.ModelEnum;
import modellen.ModelManager;

public class MenuBalkLuisteraar implements ActionListener{
	
	private ModelManager modelmanager;
	
	public MenuBalkLuisteraar(ModelManager modelmanager){
		this.modelmanager = modelmanager;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//delegeer
		modelmanager.getModel(modelmanager.getMapModel().get(e.getActionCommand())).actionPerformed(e);
		
		
	}

}
