package output;

import org.junit.Test;

import anayser.impl.GeneralTextAnalyser;
import datamodel.DataModel;
import renderer.impl.GeneralRenderer;

import static org.junit.Assert.assertEquals;

public class GeneralOutputTests {

	GeneralRenderer underTest = new GeneralRenderer();
	GeneralTextAnalyser dataModel = new GeneralTextAnalyser();

	@Test
	public void returnCorrectOutput() {
		// Given
		String testString = "this is the test string";
		// When
		DataModel someString = dataModel.analyse(testString);
		String result = underTest.render(someString);
		// Then
		assertEquals(
				"\nGeneral Data about the text\n----------------------\nThe Number Of words The Text Has Is: 5\nThe Average Word Length Is: 3.8\nThe Mode Word Length Is: 4.0\nThe Median Word Length Is: 4.0\nThe Range Of Word Lengths Is: 4\nThe Longest Word Is: 6\nThe Shortest Word Is: 2\nThe Number Of Special Characters Is: 0\nThe Number Of Paragraphs In The Text Is: 1",
				result);
	}
	
	@Test
	public void returnCorrectOutputForEdgeCases() {
		// Given
		String testString = "this,   is.testin?";
		// When
		DataModel someString = dataModel.analyse(testString);
		String result = underTest.render(someString);
		// Then
		assertEquals("\nGeneral Data about the text\n----------------------\nThe Number Of words The Text Has Is: 3\nThe Average Word Length Is: 4.0\nThe Mode Word Length Is: 2.0\nThe Median Word Length Is: 4.0\nThe Range Of Word Lengths Is: 4\nThe Longest Word Is: 6\nThe Shortest Word Is: 2\nThe Number Of Special Characters Is: 3\nThe Number Of Paragraphs In The Text Is: 1", result);
	}

}
