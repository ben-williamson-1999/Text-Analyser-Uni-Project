package runner.impl;

import input.impl.ConsoleInput;
import input.impl.FileInput;
import runner.Runner;

public class FileInputRunner implements Runner {

	@Override
	public void run() {

		String fileInput = new FileInput(new ConsoleInput()).getInput();

		OUTPUT.output(GENERAL_RENDERER.render(GENERAL_TEXT_ANALYSER.analyse(fileInput)));
		OUTPUT.output(CHARACTER_FREQUENCY_RENDERER.render(CHARACTER_FREQUENCY_ANALYSER.analyse(fileInput)));
		OUTPUT.output(RELATIVE_FREQUENCY_RENDERER.render(RELATIVE_FREQUENCY_ANALYSER.analyse(fileInput)));

	}

}