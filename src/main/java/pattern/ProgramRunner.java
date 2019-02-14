package pattern;

import runner.Runner;
import runner.impl.ConsoleInputRunner;
import runner.impl.DemoFileInputRunner;
import runner.impl.ExitApplicationRunner;
import runner.impl.FileInputRunner;

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
