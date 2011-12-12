package eventHandlers;

import handlers.CreditHandler;
import handlers.DummyHandler;
import handlers.InputWindow;
import handlers.LoadFile;
import handlers.Reset;
import handlers.Solve;
import handlers.StapSolve;

import java.util.HashMap;

import modellen.ModelManager;

public class EventManager {
	
	private HashMap<EventEnum,EventHandler> eventmap = new HashMap<EventEnum,EventHandler>();
	private HashMap<String,EventEnum> eventNameMapping = new HashMap<String,EventEnum>();
	
	private ModelManager modelmanager;
	
	public EventManager(ModelManager modelmanager){
		this.modelmanager = modelmanager;
		
		eventmap.put(EventEnum.openfile, new LoadFile());
		eventmap.put(EventEnum.solve, new Solve());
		eventmap.put(EventEnum.reset, new Reset());
		eventmap.put(EventEnum.stap, new StapSolve());
		eventmap.put(EventEnum.credit, new CreditHandler());
		eventmap.put(EventEnum.dummy,new DummyHandler());
		eventmap.put(EventEnum.inputwindow, new InputWindow());
		
		eventNameMapping.put("openfile", EventEnum.openfile);
		eventNameMapping.put("dummy", EventEnum.dummy);
		eventNameMapping.put("reset", EventEnum.reset);
		eventNameMapping.put("solve", EventEnum.solve);
		eventNameMapping.put("stap", EventEnum.stap);
		eventNameMapping.put("credit",EventEnum.credit);
		eventNameMapping.put("inputwindow",EventEnum.inputwindow);
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
