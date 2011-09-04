package modellen;

import java.util.HashMap;

import eventHandlers.EventManager;

public class ModelManager {
	
	private HashMap<ModelEnum,Model> lijstmodellen = new HashMap<ModelEnum,Model>();
	private HashMap<String,ModelEnum> mapmodel = new HashMap<String,ModelEnum>();
	
	public ModelManager(){
		lijstmodellen.put(ModelEnum.dummy, new DummyModel());
		lijstmodellen.put(ModelEnum.sudokugrid, new SudokuGrid());
		
		
		
		mapmodel.put("openfile", ModelEnum.sudokugrid); //model geimplementeerdt
		mapmodel.put("solve", ModelEnum.solve); //model geimplementeerdt
		mapmodel.put("credit", ModelEnum.credit); //model geimplementeerdt
		mapmodel.put("reset", ModelEnum.reset); //model geimplementeertdt
		
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
