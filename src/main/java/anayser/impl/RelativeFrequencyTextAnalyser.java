package anayser.impl;

import java.util.Map;

import anayser.TextAnalyser;
import datamodel.DataModel;

public class RelativeFrequencyTextAnalyser extends CharacterFrequencyTextAnalyser implements TextAnalyser {

	@Override
	public DataModel analyse(String input) {
		Map<Character, Double> relativeFrequencyMap = getRelativeFrequencyMap(input);
		return new DataModel()
				.setRelativeFrequencyMap(relativeFrequencyMap)
				;
	}

	private Map<Character, Double> getRelativeFrequencyMap(String input) {
		Map <Character,Double> map = getCharacterFrequencyMap(input);
		for(Map.Entry<Character, Double> entry : map.entrySet()) {
			entry.setValue(entry.getValue()/sanitiseInput(input).length());
		}
		return map;
	}

}
