package handlers;

import modellen.ModelManager;
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
		this.eventmanager = eventmanager;
		System.out.println("Solve");
		
	}

}
