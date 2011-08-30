package menubalk;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import modellen.ModelManager;

public class MenuBalk extends JMenuBar{
	private JMenu menu = new JMenu("Bestand"); //algemene menuitem
	private JMenuItem[] menuitem = new JMenuItem[3];
	
	private final String[] ACTIECOMMAND = {"open-file","solve","credit"};
	private final String[] OPSCHRIFT = {"Open sudokufile","los op","credit"};
	private final String[] ACELERATOR = {"ctr-O","ctrl-S","ctr-c"};
	
	private ModelManager modelmanager;
	
	public MenuBalk(ModelManager modelmanager){
		super();
		this.modelmanager = modelmanager;
		
		for(int i = 0; i < OPSCHRIFT.length; i++){
			menuitem[i] = new JMenuItem(OPSCHRIFT[i]);
			menuitem[i].setActionCommand(ACTIECOMMAND[i]);
			menuitem[i].setAccelerator(KeyStroke.getKeyStroke(ACELERATOR[i]));
			menuitem[i].addActionListener(new MenuBalkLuisteraar(modelmanager));
			
		}
		for(int i = 0; i < menuitem.length; i++){
			menu.add(menuitem[i]);
			add(menu);
		}
		
	}
	
}
