package handlers;

import modellen.ModelManager;
import eventHandlers.EventHandler;

public class DummyHandler implements EventHandler{

	@Override
	public void performEvent(ModelManager modelmanager) {
		// TODO Auto-generated method stub
		System.out.println("DummyEvent handler");
		
	}

}
