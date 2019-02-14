package input.impl;

import java.util.Scanner;

import input.TextInput;

public class ConsoleInput implements TextInput {

	@Override
	public String getInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

}
