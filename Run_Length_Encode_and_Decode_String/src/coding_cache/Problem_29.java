package coding_cache;

/*
 *Problem 29: Easy
 * Run-length encoding is a fast and simple method of encoding strings
 * The basic idea is to represent repeated successive characters as a 
 * single count and character. For example, the string "AAAABBBCCDAA" would be 
 * encoded as "4A3B2C1D2A".
 * 
 * Implement run-length encoding and decoding. you can assume the 
 * string to be encoded have no digits and consists solely of alphabetic characters.
 * You can assume the string to be decoded is valid.
 *
 */

public class Problem_29 
{
		static String original_string = "AAAABBBCCDAA";
		static Solution_29 sol_29 = new Solution_29();
		static String encoded_string = "";
		static String decoded_string = "";
	
	public static void main(String[] args) 
	{
		encoded_string = sol_29.run_Length_Encode_String(original_string);
		System.out.println(encoded_string);
		
		decoded_string = sol_29.run_Length_Decode_String(encoded_string);
		System.out.println(decoded_string);
	}
}
