package analyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import anayser.impl.RelativeFrequencyTextAnalyser;
import datamodel.DataModel;

public class RelativeFrequencyAnalysisTests {

	RelativeFrequencyTextAnalyser underTest = new RelativeFrequencyTextAnalyser();

	@Test
	public void shouldReturnCorrectValuesFromMap() {
		// Given
		String testString = "i hate programming";
		// When
		DataModel result = underTest.analyse(testString);
		// Then
		assertEquals(0.125, result.getRelativeFrequencyMap().get('a'), 0.00001);
		assertEquals(0.0625, result.getRelativeFrequencyMap().get('t'), 0.00001);
	}

	@Test
	public void shouldReturnCorrectValueIncludingSpecialCases() {
		// Given
		String testString = "%�&*$�&�$*$aaaa^$�&$&$&%$bbbb$�%&�^*($^cccc";
		// When
		DataModel result = underTest.analyse(testString);
		// Then
		assertEquals(0.333, result.getRelativeFrequencyMap().get('a'),0.01);
		assertEquals(0.333, result.getRelativeFrequencyMap().get('b'),0.01);
		assertNull(result.getRelativeFrequencyMap().get('h'));
	}
}
