package runner;

import anayser.impl.CharacterFrequencyTextAnalyser;
import anayser.impl.GeneralTextAnalyser;
import anayser.impl.RelativeFrequencyTextAnalyser;
import input.impl.ConsoleInput;
import output.impl.ConsoleOutput;
import renderer.impl.CharacterFrequencyRenderer;
import renderer.impl.GeneralRenderer;
import renderer.impl.RelativeFrequencyRenderer;

public interface Runner {

	public static final ConsoleOutput OUTPUT = new ConsoleOutput();

	public static final ConsoleInput INPUT = new ConsoleInput();

	public static final GeneralTextAnalyser GENERAL_TEXT_ANALYSER = new GeneralTextAnalyser();

	public static final GeneralRenderer GENERAL_RENDERER = new GeneralRenderer();

	public static final CharacterFrequencyTextAnalyser CHARACTER_FREQUENCY_ANALYSER = new CharacterFrequencyTextAnalyser();

	public static final CharacterFrequencyRenderer CHARACTER_FREQUENCY_RENDERER = new CharacterFrequencyRenderer();

	public static final RelativeFrequencyTextAnalyser RELATIVE_FREQUENCY_ANALYSER = new RelativeFrequencyTextAnalyser();

	public static final RelativeFrequencyRenderer RELATIVE_FREQUENCY_RENDERER = new RelativeFrequencyRenderer();

	void run();
}
