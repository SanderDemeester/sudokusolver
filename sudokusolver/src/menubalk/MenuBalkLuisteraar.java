package menubalk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import modellen.ModelEnum;
import modellen.ModelManager;

public class MenuBalkLuisteraar implements ActionListener{
	
	private ModelManager modelmanager;
	private HashMap<String,ModelEnum> mapmodel = new HashMap<String,ModelEnum>();
	public MenuBalkLuisteraar(ModelManager modelmanager){
		this.modelmanager = modelmanager;
		mapmodel.put("open-file", ModelEnum.Null); //model nog niet geimplementeerdt
		mapmodel.put("solve", ModelEnum.Null); //model nog niet geimplementeerdt
		mapmodel.put("credit", ModelEnum.Null); //model nog niet geiplementeert
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("action performed");
		modelmanager.getmodel(mapmodel.get(e.getActionCommand())).actionPerformed(e);
		
		
	}

}
