package modellen;

import java.awt.event.ActionEvent;
import java.io.File;

import eventHandlers.EventManager;


public class FileModel extends Model{
	
	private File sudokufile;
	public FileModel(){
		
	}
	
	public void addFile(File sudokufile){
		this.sudokufile = sudokufile;
		firestateChaned();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("FileModel actionPerformed");
	}
	
}