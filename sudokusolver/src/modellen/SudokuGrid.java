package modellen;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


public class SudokuGrid extends Model{
	
	private File sudokufile;
	private int[][] grid;
	private int len;
	public SudokuGrid(){
		
	}
	
	private void parsefile(){
		boolean first = true;
		try{
			BufferedReader bufferedreader = new BufferedReader(new FileReader(sudokufile));
			String line;
			while((line=bufferedreader.readLine()) != null){
				if(first){
					len = Integer.parseInt(line);
					first = false;
					grid = new int[len][len];
				}else{
					String[] treePairNumber = line.split(" ");
					for(String pair : treePairNumber){
				int i = Integer.parseInt(pair.substring(0,1));
				int j = Integer.parseInt(pair.substring(1,2));
				int val = Integer.parseInt(pair.substring(2,3));
				grid[i][j] = val;
					}
				}
			}
		}catch(Exception ex){
			System.out.println("Fout gebeurdt tijdens het verwerken van de sudokufile");
			ex.printStackTrace();
		}
		//toonGridCLI();
	}
	
	public void solve(){
		if(!solve(0,0,grid)){
			//toonGridCLI();	
			JOptionPane.showMessageDialog(null,
				    "Geen oplossingen gevonden",
				    null, JOptionPane.ERROR_MESSAGE);
		}
		firestateChaned();
	}
	
	public void reset(){
		grid = new int[len][len];
		sudokufile = null;
		firestateChaned();
	}
	
	private boolean solve(int i, int j, int[][] matrix){
		if(i == len){
			i = 0;
			if(++j == len)
				return true;
		}
		if(matrix[i][j] != 0) //sla gevulde componenten in de matrix over
			return solve(i+1,j,matrix);
		
		for(int val = 1; val <= 9; ++val){
			if(legal(i,j,val,matrix)){
				matrix[i][j] = val;
				if(solve(i+1,j,matrix))
					return true;
			}
		}
		matrix[i][j] = 0; //reset voor backtracking
		return false;
		
	}
	
	private boolean legal(int i, int j, int val, int[][] matrix){
		for(int k = 0; k < len; ++k) //rij
			if(val == matrix[k][j])
				return false;
		
		for(int k = 0; k < len; ++k)
			if(val == matrix[i][k]) //kol
				return false;
		int boxRijOffset = (i / 3)*3;
		int boxKolOffset = (j / 3)*3;
		
		for(int k = 0; k < 3; ++k) //box
			for(int m = 0; m < 3; ++m)
				if(val == matrix[boxRijOffset+k][boxKolOffset+m])
					return false;
		return true;
	}
	public int[][] getGrid(){
		return grid;
	}
	
	private void toonGridCLI(){
		for(int i = 0; i < 9; i++){
			if(i % 3 == 0)
				System.out.println("-------------------------");
			for(int j = 0; j < 9; j++){
				if(j % 3 == 0)
					System.out.print("| ");
				System.out.print(grid[i][j] == 0 ? " " : Integer.toString(grid[i][j]));
				System.out.print(" ");
			}
			System.out.println("| ");
		}
		System.out.println("-------------------------");
			}
	public void addFile(File sudokufile){
		this.sudokufile = sudokufile;
		parsefile();
		firestateChaned();
	}
	
	public boolean fileloaded(){
		return sudokufile == null;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("SudokuGrid actionPerformed"); //DEBUG
	}
	
}