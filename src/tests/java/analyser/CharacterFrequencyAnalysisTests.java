package analyser;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import anayser.impl.CharacterFrequencyTextAnalyser;
import datamodel.DataModel;

public class CharacterFrequencyAnalysisTests {

	CharacterFrequencyTextAnalyser underTest = new CharacterFrequencyTextAnalyser();
	
	@Test
	public void returnCorrectCharacterFrequencyMap() {
		//Given
		String testString = "i hate programming";
		//When
		DataModel result = underTest.analyse(testString);
		//Then
		assertEquals(2.0, result.getCharacterFrequencyMap().get('a'),0.01);
		assertEquals(2.0, result.getCharacterFrequencyMap().get('i'),0.01);
	}
	
	@Test
	public void resturnCorrectCharacterFromMapEdgeCases() {
		//Given
		String testSting = "0,i35 8wyh4o sh.se h3nq�gaaaaaa";
		//When
		DataModel result = underTest.analyse(testSting);
		//Then
		assertEquals(6.0, result.getCharacterFrequencyMap().get('a'),0.01);
		assertNull(result.getCharacterFrequencyMap().get('j'));
	}
}
