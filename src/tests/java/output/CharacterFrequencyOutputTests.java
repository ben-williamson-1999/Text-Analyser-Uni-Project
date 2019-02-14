package tests.java.output;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.anayser.impl.CharacterFrequencyTextAnalyser;
import main.java.datamodel.DataModel;
import main.java.renderer.impl.CharacterFrequencyRenderer;

public class CharacterFrequencyOutputTests {

	CharacterFrequencyRenderer underTest = new CharacterFrequencyRenderer();
	CharacterFrequencyTextAnalyser dataModel = new CharacterFrequencyTextAnalyser();

	@Test
	public void returnCorrectOutput() {
		// Given
		String testString = "i hate programming";
		// When
		DataModel someString = dataModel.analyse(testString);
		String result = underTest.render(someString);
		// Then
		assertEquals("\nCharacter Frequency \n----------------------\ni = ||\nh = |\na = ||\nt = |\ne = |\np = |\nr = ||\no = |\ng = ||\nm = ||\nn = |\n----------------------", result);
	}

}
