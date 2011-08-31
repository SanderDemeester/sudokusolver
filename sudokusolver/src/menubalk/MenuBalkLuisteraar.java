package menubalk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modellen.ModelManager;
import eventHandlers.EventManager;

public class MenuBalkLuisteraar implements ActionListener{
	
	private ModelManager modelmanager;
	private EventManager eventmanager;
	
	public MenuBalkLuisteraar(ModelManager modelmanager,
								EventManager eventmanager){
		this.modelmanager = modelmanager;
		this.eventmanager = eventmanager;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//delegeer model events adhv ModelEnum
		eventmanager.parseEvent(
				eventmanager.getEventNameMapping().get(e.getActionCommand())).performEvent(
						modelmanager,e.getActionCommand()
						);
		
	}

}
