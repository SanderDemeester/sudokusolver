package modellen;

import java.util.ArrayList;

import javax.swing.JFrame;

public class GUIManager {
	
	private JFrame frame;
	ArrayList<JFrame> framelist;
	public GUIManager(){
		framelist = new ArrayList<JFrame>();
	}
	
	public GUIManager(JFrame frame){
		framelist = new ArrayList<JFrame>();
		framelist.add(frame);
	}
	
	public void setJFrame(JFrame frame){
		framelist.add(frame);
		this.frame = frame;
	}
	
	public JFrame getJFrame(int i){
		if(i > framelist.size())
			return null;
		return frame;
	}
}
