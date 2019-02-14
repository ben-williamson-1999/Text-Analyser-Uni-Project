package main.java.runner.impl;

import main.java.output.impl.ConsoleOutput;
import main.java.runner.Runner;

public class ExitApplicationRunner implements Runner{

	@Override
	public void run() {
		new ConsoleOutput().output("Thank you for using my program");
		System.exit(0);
	}

}
