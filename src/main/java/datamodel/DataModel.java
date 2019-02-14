package main.java.datamodel;

import java.util.Map;

public class DataModel {

	private int numberOfWords;

	private double meanWordLength;

	private int modeWordLength;

	private double medianWordLength;

	private int rangeWordLength;

	private int longestWord;

	private int shortestWord;

	private int specialCharactersCount;

	private int paragraphsCount;

	private Map<Character, Double> characterFrequencyMap;

	private Map<Character, Double> relativeFrequencyMap;

	public int getLongestWord() {
		return longestWord;
	}

	public DataModel setLongestWord(int longestWord) {
		this.longestWord = longestWord;
		return this;
	}

	public int getShortestWord() {
		return shortestWord;
	}

	public DataModel setShortestWord(int shortestWord) {
		this.shortestWord = shortestWord;
		return this;
	}

	public int getNumberOfWords() {
		return numberOfWords;
	}

	public DataModel setNumberOfWords(int lengthOfWord) {
		this.numberOfWords = lengthOfWord;
		return this;
	}

	public double getMeanWordLength() {
		return meanWordLength;
	}

	public DataModel setMeanWordLength(double meanWordLength) {
		this.meanWordLength = meanWordLength;
		return this;
	}

	public double getModeWordLength() {
		return modeWordLength;
	}

	public DataModel setModeWordLength(int modeWordLength) {
		this.modeWordLength = modeWordLength;
		return this;
	}

	public double getMedianWordLength() {
		return medianWordLength;
	}

	public DataModel setMedianWordLength(double medianWordLength) {
		this.medianWordLength = medianWordLength;
		return this;
	}

	public int getRangeWordLength() {
		return rangeWordLength;
	}

	public DataModel setRangeWordLength(int rangeWordLength) {
		this.rangeWordLength = rangeWordLength;
		return this;
	}

	public int getSpecialCharactersCount() {
		return specialCharactersCount;
	}

	public DataModel setSpecialCharactersCount(int specialCharactersCount) {
		this.specialCharactersCount = specialCharactersCount;
		return this;
	}

	public int getParagraphsCount() {
		return paragraphsCount;
	}

	public DataModel setParagraphsCount(int paragraphsCount) {
		this.paragraphsCount = paragraphsCount;
		return this;
	}

	public Map<Character, Double> getCharacterFrequencyMap() {
		return characterFrequencyMap;
	}

	public DataModel setCharacterFrequencyMap(Map<Character, Double> characterFrequencyMap) {
		this.characterFrequencyMap = characterFrequencyMap;
		return this;
	}

	public Map<Character, Double> getRelativeFrequencyMap() {
		return relativeFrequencyMap;
	}

	public DataModel setRelativeFrequencyMap(Map<Character, Double> relativeFrequencyMap) {
		this.relativeFrequencyMap = relativeFrequencyMap;
		return this;
	}

}
