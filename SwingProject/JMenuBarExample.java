import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenuBarExample implements Runnable, ActionListener{
	private JLabel message;
	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenuItem openMenuItem;
	private JMenuItem cutMenuItem;
	private JMenuItem copyMenuItem;
	private JMenuItem pasteMenuItem;
	
	private JMenu searchMenu;
	private JMenu viewMenu;
	private JMenu settingMenu;
	private JMenu helpMenu;
	private JMenuItem menu1;
	private JMenuItem menu2;
	private JMenuItem menu3;
	private JMenuItem menu4;
	private JMenuItem menu5;
	private JMenuItem menu6;
	private JMenuItem menu7;
	private JMenuItem menu8;
	private JMenuItem menu9;
	private JMenuItem menu10;
	private JMenuItem menu11;
	private JMenuItem menu12;
	
	public void run(){
		frame = new JFrame("Java JMenuBar Example");
		menuBar = new JMenuBar();
		message = new JLabel();
		message.setHorizontalAlignment(JLabel.CENTER);
	
		fileMenu = new JMenu("File");
		openMenuItem = new JMenuItem("Open");
		fileMenu.add(openMenuItem);
	
		editMenu = new JMenu("Edit");
		cutMenuItem = new JMenuItem("Cut");
		copyMenuItem = new JMenuItem("Copy");
		pasteMenuItem = new JMenuItem("Paste");
		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);
		
		searchMenu = new JMenu("Search");
		menu1 = new JMenuItem("Menu1");
		menu2 = new JMenuItem("Menu2");
		menu3 = new JMenuItem("Menu3");
		searchMenu.add(menu1);
		searchMenu.add(menu2);
		searchMenu.add(menu3);
		
		viewMenu = new JMenu("View");
		menu4 = new JMenuItem("Menu4");
		menu5 = new JMenuItem("Menu5");
		menu6 = new JMenuItem("Menu6");
		viewMenu.add(menu4);
		viewMenu.add(menu5);
		viewMenu.add(menu6);
		
		settingMenu = new JMenu("Setting");
		menu7 = new JMenuItem("Menu7");
		menu8 = new JMenuItem("Menu8");
		menu9 = new JMenuItem("Menu9");
		settingMenu.add(menu7);
		settingMenu.add(menu8);
		settingMenu.add(menu9);
		
		helpMenu = new JMenu("Help");
		menu10 = new JMenuItem("Menu10");
		menu11 = new JMenuItem("Menu11");
		menu12 = new JMenuItem("Menu12");
		helpMenu.add(menu10);
		helpMenu.add(menu11);
		helpMenu.add(menu12);
	
		openMenuItem.addActionListener(this);
		cutMenuItem.addActionListener(this);
		copyMenuItem.addActionListener(this);
		pasteMenuItem.addActionListener(this);
		
		menu1.addActionListener(this);
		menu2.addActionListener(this);
		menu3.addActionListener(this);
		menu4.addActionListener(this);
		menu5.addActionListener(this);
		menu6.addActionListener(this);
		menu7.addActionListener(this);
		menu8.addActionListener(this);
		menu9.addActionListener(this);
		menu10.addActionListener(this);
		menu11.addActionListener(this);
		menu12.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
				launchURL("http://www.google.com");
			}
		});
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(searchMenu);
		menuBar.add(viewMenu);
		menuBar.add(settingMenu);
		menuBar.add(helpMenu);
	
		frame.setJMenuBar(menuBar);
		frame.add(message, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400,300));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void launchURL(String s) {
		String s1 = System.getProperty("os.name");
		try {

			if (s1.startsWith("Windows")) {
				Runtime.getRuntime().exec((new StringBuilder()).append("rundll32 url.dll,FileProtocolHandler ").append(s).toString());
			} 
			else 
			{
				String as[] = { "google chrome", "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
				String s2 = null;
				for (int i = 0; i < as.length && s2 == null; i++)
					if (Runtime.getRuntime().exec(new String[] { "which", as[i]   }).waitFor() == 0)
						s2 = as[i];
				if (s2 == null)
					throw new Exception("Could not find web browser");
				Runtime.getRuntime().exec(new String[] { s2, s });
			}
		} 
		catch (Exception exception) 
		{
        System.out.println("An error occured while trying to open the web browser!\n");
		}
	}
	
	public void actionPerformed(ActionEvent ev){
		String textOnMenu = ((JMenuItem)ev.getSource()).getText();
		message.setText(textOnMenu+" menu item clicked");
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new JMenuBarExample());
	}
}