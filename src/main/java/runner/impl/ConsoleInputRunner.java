package main.java.runner.impl;

import main.java.runner.Runner;

public class ConsoleInputRunner implements Runner {

	private static final String QUESTION_TEXT = "Please Enter In The Text You Want To Process";

	@Override
	public void run() {

		OUTPUT.output(QUESTION_TEXT);

		String text = INPUT.getInput();

		OUTPUT.output(GENERAL_RENDERER.render(GENERAL_TEXT_ANALYSER.analyse(text)));
		OUTPUT.output(CHARACTER_FREQUENCY_RENDERER.render(CHARACTER_FREQUENCY_ANALYSER.analyse(text)));
		OUTPUT.output(RELATIVE_FREQUENCY_RENDERER.render(RELATIVE_FREQUENCY_ANALYSER.analyse(text)));

	}

}