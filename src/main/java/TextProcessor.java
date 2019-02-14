import pattern.ProgramRunner;
import question.Question;
import question.impl.ModeQuestion;
import runner.Runner;

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
