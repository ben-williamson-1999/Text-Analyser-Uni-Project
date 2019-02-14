package renderer.impl;

import java.util.Map;

import datamodel.DataModel;
import renderer.TextRenderer;

public class CharacterFrequencyRenderer implements TextRenderer{

	@Override
	public String render(DataModel data) {
		String characterFrequencyRenderer = "";
		characterFrequencyRenderer += "\nCharacter Frequency \n----------------------\n";
		characterFrequencyRenderer += mapToString(data.getCharacterFrequencyMap());
		characterFrequencyRenderer += "----------------------";
		return characterFrequencyRenderer;
	}
	
	private String mapToString(Map<Character, Double> map) {
		String mapToString = "";
		for (Map.Entry<Character, Double> entry : map.entrySet()) {
			mapToString += entry.getKey() + " = " + populateChart(entry.getValue())+"\n";
		}
		return mapToString;
	}
	
	private String populateChart(double frequency) {
		return new String(new char[(int) frequency]).replace("\0", "|");
	}

}
