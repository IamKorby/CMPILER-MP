package driver;

import controller.SourceCodeChecker;
import view.MainGUI;

public class Driver
{
	public static void main(String[] args)
	{
		SourceCodeChecker controller = new SourceCodeChecker();
		MainGUI mainGUI = new MainGUI(controller);
		controller.setView(mainGUI);
	}
}
