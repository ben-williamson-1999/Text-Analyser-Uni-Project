package anayser.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import anayser.TextAnalyser;
import datamodel.DataModel;

public class CharacterFrequencyTextAnalyser implements TextAnalyser {

	@Override
	public DataModel analyse(String input) {
		Map<Character, Double> characterFrequencyMap = getCharacterFrequencyMap(input);
		return new DataModel().setCharacterFrequencyMap(characterFrequencyMap);
	}

	protected Map<Character, Double> getCharacterFrequencyMap(String input) {
		Map<Character, Double> map = new LinkedHashMap<>();
		for (Character c : sanitiseInput(input).toCharArray()) {
			Double count = map.get(c);
			if (count == null) {
				map.put(c, 1.0);
			} else {
				map.put(c, ++count);
			}
		}
		return map;
	}

	protected String sanitiseInput(String input) {
		return input.replaceAll("[^a-zA-Z ]", " ").replaceAll(" +", "").toLowerCase();
	}

}