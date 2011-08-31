package modellen;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SudokuGrid extends Model{
	
	private File sudokufile;
	public SudokuGrid(){
		
	}
	
	private void parsefile(){
		
		try{
			BufferedReader bufferedreader = new BufferedReader(new FileReader(sudokufile));
			String str;
			while((str=bufferedreader.readLine()) != null){
				System.out.println(str);
			}
		}catch(IOException ex){
			System.out.println("Fout gebeurdt tijdens het verwerken van de sudokufile");
			ex.printStackTrace();
		}
		
	}
	
	public void addFile(File sudokufile){
		this.sudokufile = sudokufile;
		parsefile();
		firestateChaned();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("FileModel actionPerformed");
	}
	
}