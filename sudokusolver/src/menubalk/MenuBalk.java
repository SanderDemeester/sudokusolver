package menubalk;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import modellen.ModelManager;
import eventHandlers.EventManager;

public class MenuBalk extends JMenuBar{
	private JMenu menu = new JMenu("Bestand"); //algemene menuitem
	private JMenuItem[] menuitem = new JMenuItem[3];
	
	private final String[] ACTIECOMMAND = {"openfile","solve","credit"};
	private final String[] OPSCHRIFT = {"Open sudokufile","los op","credit"};
	private final String[] ACELERATOR = {"ctr-O","ctrl-S","ctr-c"};
	
	private ModelManager modelmanager;
	private EventManager eventmanager;
	
	public MenuBalk(ModelManager modelmanager,
					EventManager eventmanager){
		super();
		this.modelmanager = modelmanager;
		this.eventmanager = eventmanager;
		
		for(int i = 0; i < OPSCHRIFT.length; i++){
			menuitem[i] = new JMenuItem(OPSCHRIFT[i]);
			menuitem[i].setActionCommand(ACTIECOMMAND[i]);
			menuitem[i].setAccelerator(KeyStroke.getKeyStroke(ACELERATOR[i]));
			menuitem[i].addActionListener(new MenuBalkLuisteraar(modelmanager,eventmanager));
			
		}
		for(int i = 0; i < menuitem.length; i++){
			menu.add(menuitem[i]);
			add(menu);
		}
		
	}
	
}
