package modellen;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SudokuGrid extends Model{
	
	private File sudokufile;
	private int[][] grid;
	public SudokuGrid(){
		
	}
	
	private void parsefile(){
		boolean first = true;
		try{
			BufferedReader bufferedreader = new BufferedReader(new FileReader(sudokufile));
			String line;
			while((line=bufferedreader.readLine()) != null){
				if(first){
					int len = Integer.parseInt(line);
					first = false;
					grid = new int[len][len];
				}
				
				int i = Integer.parseInt(line.substring(0,1));
				int j = Integer.parseInt(line.substring(1,2));
				int val = Integer.parseInt(line.substring(2,3));
				grid[i][j] = val;
			}
		}catch(IOException ex){
			System.out.println("Fout gebeurdt tijdens het verwerken van de sudokufile");
			ex.printStackTrace();
		}
		toonGrid();
	}
	public int[][] getGrid(){
		return grid;
	}
	
	private void toonGrid(){
		for(int i = 0; i < 9; i++){
			if(i % 3 == 0 ){
				System.out.println("------------------");
			}
			for(int j = 0; j < 9; j++){
				if(j % 3 == 0){
					System.out.println("|");
				}
				System.out.println(grid[i][j] == 0 ? " " : Integer.toString(grid[i][j]));
				System.out.println(" ");
			}
			System.out.println(' ');
		}
		System.out.println("-------------------------");
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