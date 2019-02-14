package input.impl;

import java.io.BufferedReader;
import java.io.FileReader;

import input.TextInput;
import output.impl.ConsoleOutput;

public class FileInput implements TextInput {

	private final String filePath;

	public FileInput(TextInput fileNameRetriever) {
		this.filePath = getFileName(fileNameRetriever);
	}

	public FileInput(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String getInput() {
		try (BufferedReader b = new BufferedReader(new FileReader(filePath))) {
			StringBuilder sb = new StringBuilder();
			b.lines().forEach(l -> sb.append(l).append(" "));
			return sb.toString().trim();
		} catch (Exception e) {
			throw new RuntimeException("File Not Found", e);
		}

	}

	private String getFileName(TextInput fileNameRetriever) {

		new ConsoleOutput().output("Please enter the Filename you want to analyse");

		String fileName = ".\\src\\main\\resources\\"
				+ fileNameRetriever.getInput();

		return fileName;
	}

}
