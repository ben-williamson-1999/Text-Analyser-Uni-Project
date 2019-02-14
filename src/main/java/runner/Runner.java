package main.java.runner;

import main.java.anayser.impl.CharacterFrequencyTextAnalyser;
import main.java.anayser.impl.GeneralTextAnalyser;
import main.java.anayser.impl.RelativeFrequencyTextAnalyser;
import main.java.input.impl.ConsoleInput;
import main.java.output.impl.ConsoleOutput;
import main.java.renderer.impl.CharacterFrequencyRenderer;
import main.java.renderer.impl.GeneralRenderer;
import main.java.renderer.impl.RelativeFrequencyRenderer;

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
