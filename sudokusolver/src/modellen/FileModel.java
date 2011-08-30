package modellen;

import java.awt.event.ActionEvent;
import java.io.File;


public class FileModel extends Model{
	
	File sudokufile;
	
	public FileModel(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("FileModel actionPerformed");
	}
	
}