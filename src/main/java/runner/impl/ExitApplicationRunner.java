package runner.impl;

import output.impl.ConsoleOutput;
import runner.Runner;

public class ExitApplicationRunner implements Runner{

	@Override
	public void run() {
		new ConsoleOutput().output("Thank you for using my program");
		System.exit(0);
	}

}
