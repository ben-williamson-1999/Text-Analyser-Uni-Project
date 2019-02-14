package main.java.output.impl;

import main.java.output.Output;

public class ConsoleOutput implements Output{

	@Override
	public void output(String output) {
		System.out.println(output);
	}
}
