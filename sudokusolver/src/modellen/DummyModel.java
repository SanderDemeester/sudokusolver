package modellen;

import java.awt.event.ActionEvent;

public class DummyModel extends Model{
	
	public DummyModel(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("DummyModel action performed");
	}

}
