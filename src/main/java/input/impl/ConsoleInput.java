package main.java.input.impl;

import java.util.Scanner;

import main.java.input.TextInput;

public class ConsoleInput implements TextInput {

	@Override
	public String getInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

}
