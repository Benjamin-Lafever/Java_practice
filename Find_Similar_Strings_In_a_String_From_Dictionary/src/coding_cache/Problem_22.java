package coding_cache;

import java.util.Hashtable;

public class Problem_22 {

	//Problem: [Medium]
	/* Given a dictionary of words and a string made up of those words (no spaces), 
	 * return the original sentence in a list. If there is more than one possible 
	 * reconstruction, return any of them. If there is no possible reconstruction 
	 * then return null
	 * 
	 * For example, given the set of words 'quick', 'brown', 'the', 'fox', and 
	 * the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox']
	 * 
	 * Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string 
	 * "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond']
	 * or ['bedbath', 'and', 'beyond']
	 */

	public static void main(String[] args) {
		
		Hashtable<Integer, String> words = new Hashtable<Integer, String>();
		String compare = "bedbathandbeyond";
		String[] common_strings = new String[words.size()];
		
		words.put(0, "bed");
		words.put(1, "bath");
		words.put(2, "bedbath");
		words.put(3, "and");
		words.put(4, "beyond");
		words.put(5, "bey");
		
		common_strings = Solution_22.findCommonStrings(words, compare);
		for(String i: common_strings) {
			System.out.println(i);
		}
	}
}


