package question.impl;

import input.impl.ConsoleInput;
import output.impl.ConsoleOutput;
import question.Question;

public class ModeQuestion implements Question{
	
	private static final String QUESTION_TEXT = "Welcome To My Application\nPlease Choose If You Want To\n\t�Input Text Via The Console (console)\n\t�Input the Name of the File (file)\n\t�Demo the Application (demo)\n\t�Exit the Application (exit)";
	
	public String askQuestion() {
		new ConsoleOutput().output(QUESTION_TEXT);
		String input = new ConsoleInput().getInput().toLowerCase();
		if (isValid(input)) {
			return input;
		} else {
			return askQuestion();
		}
	}

	private boolean isValid(String input) {
		return "console".equals(input)||"file".equals(input)||"demo".equals(input)||"exit".equals(input);
		
	}
	
	//TODO another method called getQuestion from abstract
}
