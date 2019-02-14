package runner.impl;

import input.impl.FileInput;
import runner.Runner;

public class DemoFileInputRunner implements Runner {

	private static final String OUTPUT_TEXT = "The original text is: \n"
			+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type\nspecimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, \nand more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

	private static final String INPUT_TEXT = new FileInput(
			"./src/main/resources/demotextfile")
					.getInput();

	@Override
	public void run() {
		OUTPUT.output(OUTPUT_TEXT);
		OUTPUT.output(GENERAL_RENDERER.render(GENERAL_TEXT_ANALYSER.analyse(INPUT_TEXT)));
		OUTPUT.output(CHARACTER_FREQUENCY_RENDERER.render(CHARACTER_FREQUENCY_ANALYSER.analyse(INPUT_TEXT)));
		OUTPUT.output(RELATIVE_FREQUENCY_RENDERER.render(RELATIVE_FREQUENCY_ANALYSER.analyse(INPUT_TEXT)));
	}

}