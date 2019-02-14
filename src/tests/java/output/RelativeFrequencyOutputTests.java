package tests.java.output;

import org.junit.Test;

import main.java.anayser.impl.RelativeFrequencyTextAnalyser;
import main.java.datamodel.DataModel;
import main.java.renderer.impl.RelativeFrequencyRenderer;

import static org.junit.Assert.assertEquals;

public class RelativeFrequencyOutputTests {

	RelativeFrequencyRenderer underTest = new RelativeFrequencyRenderer();
	RelativeFrequencyTextAnalyser dataModel = new RelativeFrequencyTextAnalyser();

	@Test
	public void shouldReturnCorrectOutputs() {
		// Given
		String testString = "aaaa bbbb, cccc";
		// When
		DataModel someString = dataModel.analyse(testString);
		String result = underTest.render(someString);
		// Then
		assertEquals(
				"Relative Frequency\n--------------------\n|   a   | 0.333333 |\n|   b   | 0.333333 |\n|   c   | 0.333333 |\n--------------------\n",
				result);
	}

	@Test
	public void shouldReturnCorrectOutputsWithSpecialCharacters() {
		// Given
		String testString = "%�&*$�&�$*$aaaa^$�&$&$&%$bbbb$�%&�^*($^cccc";
		// When
		DataModel someString = dataModel.analyse(testString);
		String result = underTest.render(someString);
		// Then
		assertEquals(
				"Relative Frequency\n--------------------\n|   a   | 0.333333 |\n|   b   | 0.333333 |\n|   c   | 0.333333 |\n--------------------\n",
				result);
	}
}
