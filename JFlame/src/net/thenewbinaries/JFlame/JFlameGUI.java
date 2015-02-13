package net.thenewbinaries.JFlame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JFlameGUI extends JFrame {
	
	/**
	 * The JMenuBar called "menuBar" for the main window
	 */
	public static JMenuBar menuBar = new JMenuBar();
	
	/**
	 * The Menus for menuBar
	 */
	public static JMenu fileMenu = new JMenu("File");
	public static JMenu editMenu = new JMenu("Edit");
	
	/**
	 * The MenuItems for the menus organized by Menus in order as they are above
	 */
	public static JMenuItem fileNew = new JMenuItem("New");
	public static JMenuItem fileOpen = new JMenuItem("Open");
	public static JMenuItem fileClose = new JMenuItem("Close");
	public static JMenuItem fileSave = new JMenuItem("Save");
	
	/**
	 * Fields for Main window
	 */
	private static String title = "UNTITLED";
	private static boolean resizable = true;
	private static boolean visible = true;
	/**
	 * Constructor Method
	 */
	public JFlameGUI() {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setResizable(resizable);
		setVisible(visible);
		
		createMenuBar(); //Method that creates the menubar
		
		setJMenuBar(menuBar); //Set the menubar of this gui
	}
	
	/**
	 * Method that creates the menubar for this gui
	 */
	private static void createMenuBar() {
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		//Add elements to fileMenu
		fileMenu.add(fileNew);
		fileMenu.add(fileOpen);
		fileMenu.add(fileClose);
		fileMenu.add(fileSave);
		
	}
	
}
