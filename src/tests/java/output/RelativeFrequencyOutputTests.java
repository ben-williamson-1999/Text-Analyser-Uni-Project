package output;

import org.junit.Test;

import anayser.impl.RelativeFrequencyTextAnalyser;
import datamodel.DataModel;
import renderer.impl.RelativeFrequencyRenderer;

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
