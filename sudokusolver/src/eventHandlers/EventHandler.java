package eventHandlers;

import modellen.ModelManager;

public interface EventHandler {
	
	public void performEvent(ModelManager modelmanager,
							String actieCommand);

}
