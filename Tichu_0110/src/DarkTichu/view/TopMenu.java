package DarkTichu.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class TopMenu extends MenuBar {
	private MenuBar menuBar = new MenuBar();

	// Create Menu Bar
	// Menu File
	Menu file = new Menu("File");
	MenuItem newGame = new MenuItem("New Game");
	MenuItem exit = new MenuItem("Exit");
	// Menu Help
	Menu help = new Menu("Help");
	MenuItem about = new MenuItem("About");
	Menu subtMenu = new Menu("Rules");
	MenuItem hands = new MenuItem("Hands");
	MenuItem genRuls = new MenuItem("General Rules");

	public TopMenu() {
		super();
		// add to the SubMenus menuItems
		subtMenu.getItems().addAll(hands, genRuls);// About submenu

		// Add MenuItem to each Menu
		file.getItems().addAll(newGame, exit);
		help.getItems().addAll(subtMenu, about);
		menuBar.getMenus().addAll(file, help);

	}

	public MenuBar getMenuBar() {
		return menuBar;
	}

}
