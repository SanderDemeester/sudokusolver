package eventHandlers;

import handlers.DummyHandler;
import handlers.LoadFile;

import java.util.HashMap;

import modellen.ModelManager;

public class EventManager {
	
	private HashMap<EventEnum,EventHandler> eventmap = new HashMap<EventEnum,EventHandler>();
	private HashMap<String,EventEnum> eventNameMapping = new HashMap<String,EventEnum>();
	
	private ModelManager modelmanager;
	
	public EventManager(ModelManager modelmanager){
		this.modelmanager = modelmanager;
		
		eventmap.put(EventEnum.openfile, new LoadFile());
		eventmap.put(EventEnum.Null,new DummyHandler());
		
		eventNameMapping.put("openfile", EventEnum.openfile);
		eventNameMapping.put("dummy", EventEnum.Null);
		eventNameMapping.put("reset", EventEnum.reset);
	}
	
	public EventHandler parseEvent(EventEnum eventenum){
		return eventmap.get(eventenum);
	}
	
	public void addEvent(EventHandler eventhandler, EventEnum eventenum){
		eventmap.put(eventenum, eventhandler);
	}
	
	public HashMap<String,EventEnum> getEventNameMapping(){
		return eventNameMapping;
	}

}
