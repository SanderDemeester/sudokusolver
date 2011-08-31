package modellen;

import java.util.HashMap;

import eventHandlers.EventManager;

public class ModelManager {
	
	private HashMap<ModelEnum,Model> lijstmodellen = new HashMap<ModelEnum,Model>();
	private HashMap<String,ModelEnum> mapmodel = new HashMap<String,ModelEnum>();
	
	public ModelManager(){
		lijstmodellen.put(ModelEnum.Null, new DummyModel());
		lijstmodellen.put(ModelEnum.openfile, new FileModel());
		
		
		mapmodel.put("openfile", ModelEnum.openfile); //model geimplementeerdt
		mapmodel.put("solve", ModelEnum.Null); //model nog niet geimplementeerdt
		mapmodel.put("credit", ModelEnum.Null); //model nog niet geiplementeert
		mapmodel.put("reset", ModelEnum.Null); //model nog niet geimplementeert
		
	}
	
	public void addModel(Model model, ModelEnum modelenum){
		lijstmodellen.put(modelenum, model);
	}
	
	public Model getModel(ModelEnum modelenum){
		return lijstmodellen.get(modelenum);
	}
	
	public HashMap<String,ModelEnum> getMapModel(){
		return mapmodel;
	}

}
