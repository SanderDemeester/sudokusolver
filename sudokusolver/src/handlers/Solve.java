package handlers;

import modellen.ModelEnum;
import modellen.ModelManager;
import modellen.SudokuGrid;
import eventHandlers.EventHandler;
import eventHandlers.EventManager;

public class Solve implements EventHandler{
	
	private int grid[][];
	private ModelManager modelmanager;
	private EventManager eventmanager;

	@Override
	public void performEvent(ModelManager modelmanager, String actieCommand) {
		// TODO Auto-generated method stub
		this.modelmanager = modelmanager;
		SudokuGrid filemodel = (SudokuGrid) modelmanager.getModel(ModelEnum.sudokugrid);
		filemodel.solve();
	}

}
