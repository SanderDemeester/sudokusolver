package modellen;

import java.util.HashMap;

public class ModelManager {
	
	private HashMap<ModelEnum,Model> lijstmodellen = new HashMap<ModelEnum,Model>();
	public ModelManager(){
		lijstmodellen.put(ModelEnum.Null, new DummyModel());
		
	}
	
	public void addModel(Model model, ModelEnum modelenum){
		lijstmodellen.put(modelenum, model);
	}
	
	public Model getmodel(ModelEnum modelenum){
		return lijstmodellen.get(modelenum);
	}
	

}
