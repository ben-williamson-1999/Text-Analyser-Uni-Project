package renderer.impl;

import java.util.Formatter;
import java.util.Map;

import datamodel.DataModel;
import renderer.TextRenderer;

public class RelativeFrequencyRenderer implements TextRenderer{

	@Override
	public String render(DataModel data) {
		String relativeFrequencyRender = "";
		relativeFrequencyRender += "Relative Frequency\n--------------------\n";
		relativeFrequencyRender += mapToString(data.getRelativeFrequencyMap());
		relativeFrequencyRender += "--------------------\n";
		return relativeFrequencyRender;
	}
	
	private String mapToString(Map<Character, Double> map) {
		
		
		String relativeFrequencyTable = "";
		
		for (Map.Entry<Character, Double> entry : map.entrySet() ) {
			relativeFrequencyTable += populateChart(entry.getKey(),entry.getValue())+"\n";
		}
		
		
		return relativeFrequencyTable ;
	}
	
	@SuppressWarnings("resource")
	private String populateChart(char key, double value) {
		return "|   "+key+"   | "+ new Formatter().format("%.6f", value) +" |";
	}

}
