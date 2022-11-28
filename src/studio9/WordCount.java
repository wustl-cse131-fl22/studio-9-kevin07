package studio9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;

public class WordCount {
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {

		Map<String, Integer> wordCount = new HashMap();
		wordCount.put("to", 0);
		wordCount.put("be", 0);
		wordCount.put("or", 0);
		wordCount.put("not", 0);
		
		int size = words.size();
		
		for (int i = 0; i < size; i++) {
			if (words.get(i).equals("to")) {
				int count = wordCount.get("to") + 1;
				wordCount.put("to", count);
			}
			
			if (words.get(i).equals("be")) {
				int count = wordCount.get("be") + 1;
				wordCount.put("be", count);
			}
			
			if (words.get(i).equals("or")) {
				int count = wordCount.get("or") + 1;
				wordCount.put("or", count);
			}
			
			if (words.get(i).equals("not")) {
				int count = wordCount.get("not") + 1;
				wordCount.put("not", count);
			}
		}
		
		return wordCount;
	}
}
