package input;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import input.impl.FileInput;

import static org.junit.Assert.assertEquals;

public class FileInputTest {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private TextInput mockFileNameRetriever = new TextInput() {
		@Override
		public String getInput() {
			return "test";
		}
	};

	@Test
	public void shouldReturnContentsOfFileWithSpaces() {
		//When
		String fileContents = new FileInput(mockFileNameRetriever).getInput();
		//Then
		assertEquals("this is a test", fileContents);
	}
	
	@Test
	public void shouldThrowRuntimeExceptionIfFileIsNotFound() {
		expectedException.expect(RuntimeException.class);
		expectedException.expectMessage("File Not Found");
		
		new FileInput(new TextInput() {
			
			@Override
			public String getInput() {
				return "doesntwork";
			}
		}).getInput();
	}
	
}
