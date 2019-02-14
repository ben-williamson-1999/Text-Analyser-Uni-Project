package renderer.impl;

import datamodel.DataModel;
import renderer.TextRenderer;

public class GeneralRenderer implements TextRenderer{

	@Override
	public String render(DataModel data) {
		String generalRender = "\nGeneral Data about the text\n----------------------";
		generalRender += "\nThe Number Of words The Text Has Is: "+String.valueOf(data.getNumberOfWords());
		generalRender += "\nThe Average Word Length Is: "+String.valueOf(data.getMeanWordLength());
		generalRender += "\nThe Mode Word Length Is: "+String.valueOf(data.getModeWordLength());
		generalRender += "\nThe Median Word Length Is: "+String.valueOf(data.getMedianWordLength());
		generalRender += "\nThe Range Of Word Lengths Is: "+String.valueOf(data.getRangeWordLength());
		generalRender += "\nThe Longest Word Is: "+String.valueOf(data.getLongestWord());
		generalRender += "\nThe Shortest Word Is: "+String.valueOf(data.getShortestWord());
		generalRender += "\nThe Number Of Special Characters Is: "+String.valueOf(data.getSpecialCharactersCount());
		generalRender += "\nThe Number Of Paragraphs In The Text Is: "+String.valueOf(data.getParagraphsCount());
		return generalRender;
	}

}
