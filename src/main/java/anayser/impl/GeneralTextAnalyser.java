package main.java.anayser.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import main.java.anayser.TextAnalyser;
import main.java.datamodel.DataModel;

public class GeneralTextAnalyser implements TextAnalyser {

	@Override
	public DataModel analyse(String input) {
		int numberOfWords = getNumberOfWords(input);
		int totalRealCharacters = getTotalRealCharacters(input);
		double meanWordLength = (double) totalRealCharacters / (double) numberOfWords;
		int modeWordLength = getModeWordLength(input);
		double medianWordLength = getMedianWordLength(input);
		int rangeWordLength = getRangeWordLength(input);
		int longestWord = getLargestWord(input);
		int shortestWord = getShortestWord(input);
		int specialCharactersCount = getSpecialCharactersCount(input);
		int paragraphsCount = getParagraphsCount(input);
		return new DataModel()
				.setNumberOfWords(numberOfWords)
				.setMeanWordLength(meanWordLength)
				.setModeWordLength(modeWordLength)
				.setMedianWordLength(medianWordLength)
				.setRangeWordLength(rangeWordLength)
				.setLongestWord(longestWord)
				.setShortestWord(shortestWord)
				.setSpecialCharactersCount(specialCharactersCount)
				.setParagraphsCount(paragraphsCount)
		;

	}

	private int getParagraphsCount(String input) {
		return input.split("\n\n").length;
	}

	private int getSpecialCharactersCount(String input) {
		return specialCharcters(input).trim().replaceAll("\\s+", "").length();
	}

	private int getShortestWord(String input) {
		Set<Integer> set = wordLengthsInSet(input);
 		return Collections.min(set);
	}

	private int getLargestWord(String input) {
		Set<Integer> set = wordLengthsInSet(input);
		return Collections.max(set);
	}
	
	private Set<Integer> wordLengthsInSet(String input){
		Set<Integer> set = Arrays.stream(sanitiseInput(input)
					.replaceAll(" +", " ")
					.trim()
					.split(" "))
				.map(String::length)
				.collect(Collectors.toSet());
		
		return set;
	}

	private int getRangeWordLength(String input) {
		Set<Integer> set = wordLengthsInSet(input);
		return (Collections.max(set)-Collections.min(set));
	}

	private String sanitiseInput(String input) {
		return input.replaceAll("[^a-zA-Z' ]+", " ").toLowerCase();
	}
	
	private String specialCharcters(String input) {
		return input.replaceAll("[a-zA-Z]", "");
	}

	private int getNumberOfWords(String input) {
		return sanitiseInput(input).split("\\s+").length;
	}

	private int getTotalRealCharacters(String input) {
		return sanitiseInput(input).replaceAll(" ", "").length();
	}

	private int getModeWordLength(String input) {
		Map<Integer, Integer> mapForMode = new HashMap<Integer, Integer>();
		int lettersInWord = 0;
		Integer modeCount;
		String rawText = sanitiseInput(input).replaceAll("\\s+", " ").trim() + " ";
		for (int i = 0; i < rawText.length(); i++) {
			if (rawText.charAt(i) != ' ') {
				lettersInWord += 1;
			} else {
				modeCount = mapForMode.get(lettersInWord);
				if (modeCount == null) {
					mapForMode.put(lettersInWord, 1);
				} else {
					mapForMode.put(lettersInWord, ++modeCount);
				}
				modeCount = 0;
				lettersInWord = 0;
			}
		}
		int toReturn = 0;
		Integer highestValue = 0;
		for (Map.Entry<Integer, Integer> entry : mapForMode.entrySet()) {
			if (highestValue == 0) {
				highestValue = entry.getValue();
				toReturn = entry.getKey();
			}

			else if (highestValue < entry.getValue()) {
				highestValue = entry.getValue();
				toReturn = entry.getKey();
			}

		}

		return toReturn;
	}

	private double getMedianWordLength(String input) {
		List<Integer> list = Arrays.stream(sanitiseInput(input).trim().split("\\s+"))
				.map(String::length).collect(Collectors.toList());
		Collections.sort(list);
		int middle = list.size() / 2;
		if (list.size() % 2 == 1) {
			return list.get(middle);
		} else {
			return (list.get(middle - 1) + list.get(middle)) / 2.0;
		}
	}

}
