package handlers;

import modellen.ModelEnum;
import modellen.ModelManager;
import modellen.SudokuGrid;
import eventHandlers.EventHandler;

public class Reset implements EventHandler{
	private ModelManager modelmanager;
	
	
	@Override
	public void performEvent(ModelManager modelmanager, String actieCommand) {
		// TODO Auto-generated method stub
		this.modelmanager = modelmanager;
		SudokuGrid filemodel = (SudokuGrid) modelmanager.getModel(ModelEnum.sudokugrid);
		filemodel.reset();
		
	}

}
