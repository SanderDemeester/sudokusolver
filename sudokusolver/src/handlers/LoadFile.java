package handlers;

import java.io.File;

import javax.swing.JFileChooser;

import modellen.FileModel;
import modellen.ModelManager;
import eventHandlers.EventHandler;

public class LoadFile implements EventHandler{

	private ModelManager modelmanager;
	private File file;
	private String actionCommand;
	private JFileChooser filekiezer = new JFileChooser(System.getProperty("user.home"));
	

	
	
	private void browefile(){
		filekiezer.showOpenDialog(null);
		file = filekiezer.getSelectedFile();
		
		FileModel filemodel = (FileModel) modelmanager.getModel(modelmanager.getMapModel().get(actionCommand));
		filemodel.addFile(file);
		
	}
	@Override
	public void performEvent(ModelManager modelmanager,String actionCommand) {
		// TODO Auto-generated method stub
		this.modelmanager = modelmanager;
		this.actionCommand = actionCommand;
		System.out.println("peformEvent in: " + LoadFile.class.toString());
		browefile();
		
		
	}


}
