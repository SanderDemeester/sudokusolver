package modellen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;

public class Model implements ActionListener{
	
	private EventListenerList list = new EventListenerList();
	public void addChangeListerner(ChangeListener l){
		list.add(ChangeListener.class, l);
	}
	
	public void removeChangeListener(ChangeListener l){
		list.remove(ChangeListener.class,l);
	}
	/**dit is de bron van het event*/
	private final ChangeEvent event = new ChangeEvent(this); 
	protected void firestateChaned(){
		Object[] l = list.getListenerList();
		for(int i = l.length-2;i>=0;i-=2){
			if(l[i] == ChangeListener.class)
				((ChangeListener)l[i+1]).stateChanged(event);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
