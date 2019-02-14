package main.java.pattern;

import main.java.runner.Runner;
import main.java.runner.impl.ConsoleInputRunner;
import main.java.runner.impl.DemoFileInputRunner;
import main.java.runner.impl.ExitApplicationRunner;
import main.java.runner.impl.FileInputRunner;

public class ProgramRunner {

	public Runner createPattern(String runnerType) {
		if (runnerType == null) {
			return null;
		}
		if (runnerType.equalsIgnoreCase("CONSOLE")) {
			return new ConsoleInputRunner();

		} else if (runnerType.equalsIgnoreCase("FILE")) {
			return new FileInputRunner();

		} else if (runnerType.equalsIgnoreCase("DEMO")) {
			return new DemoFileInputRunner();

		} else if (runnerType.equalsIgnoreCase("EXIT")) {
			return new ExitApplicationRunner();
		}

		return null;
	}

}
