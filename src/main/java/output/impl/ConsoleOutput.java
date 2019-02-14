package output.impl;

import output.Output;

public class ConsoleOutput implements Output{

	@Override
	public void output(String output) {
		System.out.println(output);
	}
}
