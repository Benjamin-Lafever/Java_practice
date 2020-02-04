package coding_cache;

import java.util.Enumeration;
import java.util.Hashtable;

public class Solution_22 {

	
	public static String[] findCommonStrings(Hashtable<Integer, String> words, String compare) {
		
		String[] common_strings = new String[words.size()];
		int array_position = 0;
		Enumeration<Integer> enumerator = words.keys();

		while(enumerator.hasMoreElements()) {
			
			Integer key = enumerator.nextElement();
			String current_string = words.get(key);

			for(int i = 0; i < compare.length() - 1; i ++) {
				if(compare.charAt(i) == current_string.charAt(0)){
					int compare_int = i;
					int current_string_int = 0;
					while(current_string_int < current_string.length()) {
						if(compare.charAt(compare_int) == current_string.charAt(current_string_int)) {
							if(current_string_int == current_string.length() - 1) {
								common_strings[array_position] = current_string;
								array_position++;
							}
							current_string_int++;
							compare_int++;
						}
						else {
							break;
						}
					}
				}
			}
		}
		return common_strings;
	}
}
