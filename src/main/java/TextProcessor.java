package main.java;

import main.java.pattern.ProgramRunner;
import main.java.question.Question;
import main.java.question.impl.ModeQuestion;
import main.java.runner.Runner;

public class TextProcessor {

	private static final Question FIRST = new ModeQuestion();

	public static void main(String[] args) {
		while (true) {
			String choice = FIRST.askQuestion();

			ProgramRunner runner = new ProgramRunner();
			Runner input = runner.createPattern(choice.toUpperCase());
			input.run();
		}
	}
}
