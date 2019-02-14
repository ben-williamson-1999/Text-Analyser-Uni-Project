package analyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import anayser.impl.GeneralTextAnalyser;
import datamodel.DataModel;

public class GeneralAnalysisTests {

	GeneralTextAnalyser underTest = new GeneralTextAnalyser();

	@Test
	public void returnLengthOfWordForFiveNoSpecialChars() {
		// Given
		String testString = "this is the test string";
		// When
		DataModel result = underTest.analyse(testString);
		// Then
		assertEquals(5, result.getNumberOfWords());
		assertEquals(3.8, result.getMeanWordLength(), 0.1);
		assertEquals(4, result.getModeWordLength(), 0.1);
		assertEquals(4.0, result.getMedianWordLength(), 0.1);
		assertEquals(4, result.getRangeWordLength());
		assertEquals(6,result.getLongestWord());
		assertEquals(2, result.getShortestWord());
		assertEquals(0, result.getSpecialCharactersCount());
		assertEquals(1, result.getParagraphsCount());
		
	}

	@Test
	public void returnLengthOfWordWithPunctuation() {
		// Given
		String testString = "this,   is.test?";
		// When
		DataModel result = underTest.analyse(testString);
		// Then
		assertEquals(3, result.getNumberOfWords());
		assertEquals(3.3, result.getMeanWordLength(), 0.1);
		assertEquals(4, result.getModeWordLength(), 0.1);
		assertEquals(4.0, result.getMedianWordLength(),0.1);
		assertEquals(2, result.getRangeWordLength());
		assertEquals(4, result.getLongestWord());
		assertEquals(2, result.getShortestWord());
		assertEquals(3, result.getSpecialCharactersCount());
		assertEquals(1, result.getParagraphsCount());

	}
	
	@Test
	public void returnCorrectNumberOfParagraphs() {
		//Given
		String testString = "this\n\nis\n\na\n\ntest";
		//When
		DataModel result = underTest.analyse(testString);
		//Then
		assertEquals(4, result.getParagraphsCount());
	}
	
	@Test
	public void test() {
		assertEquals(1, underTest.analyse("`").getSpecialCharactersCount());
		assertEquals(1, underTest.analyse("`e").getLongestWord());
	}

}
