package main.java.runner.impl;

import main.java.input.impl.ConsoleInput;
import main.java.input.impl.FileInput;
import main.java.runner.Runner;

public class FileInputRunner implements Runner {

	@Override
	public void run() {

		String fileInput = new FileInput(new ConsoleInput()).getInput();

		OUTPUT.output(GENERAL_RENDERER.render(GENERAL_TEXT_ANALYSER.analyse(fileInput)));
		OUTPUT.output(CHARACTER_FREQUENCY_RENDERER.render(CHARACTER_FREQUENCY_ANALYSER.analyse(fileInput)));
		OUTPUT.output(RELATIVE_FREQUENCY_RENDERER.render(RELATIVE_FREQUENCY_ANALYSER.analyse(fileInput)));

	}

}