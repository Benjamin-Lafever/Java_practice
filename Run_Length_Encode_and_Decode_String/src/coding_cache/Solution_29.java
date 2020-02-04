package coding_cache;

import java.util.ArrayList;

public class Solution_29 
{
	//Converts an array of characters to a string
	public String character_Buffer(Character[] decoded_array) 
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < decoded_array.length; i++) 
		{
			sb.append(decoded_array[i]);
		}
		String decoded_string = sb.toString();
		return decoded_string;
	}
	
	
	//Converts an array of strings to a string
	public String string_Buffer(String[] encoded_array) 
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < encoded_array.length; i++) 
		{
			sb.append(encoded_array[i]);
		}
		String encoded_string = sb.toString();
		return encoded_string;
	}
	
	//Takes an argument of a string and encodes it with a custom algorithm
	public String run_Length_Encode_String(String original_string) 
	{
		ArrayList<String> encoded_arraylist = new ArrayList<String>();
		
		for(int i = 0; i < original_string.length() - 1; i++) 
		{
			if(original_string.charAt(i) == original_string.charAt(i + 1)) 
			{
				int counter = 0;
				char c = original_string.charAt(i);
				for(int j = i; j < original_string.length(); j++)
				{
					if(j < original_string.length() - 1) {
						if(original_string.charAt(j) == original_string.charAt(j + 1)) 
						{
							counter++;
							i++;
						}
						else 
						{	
							counter += 1;
							String holder = Integer.toString(counter);
							encoded_arraylist.add(holder + c);
							break;
						}
					}
					else 
					{
						counter += 1;
						String holder = Integer.toString(counter);
						encoded_arraylist.add(holder + c);
						break;
					}
				}
			}
			else 
			{
				char c_2 = original_string.charAt(i);
				String holder = "1";
				encoded_arraylist.add(holder + c_2);
			}
		}
		String[] encoded_array = new String[encoded_arraylist.size()];
		for(int i = 0; i < encoded_arraylist.size(); i++)
		{
			encoded_array[i] = encoded_arraylist.get(i);
		}
		String encoded_string = string_Buffer(encoded_array);
		return encoded_string;
	}
	
	//Takes an argument of a custom encoded string and decodes it
	public String run_Length_Decode_String(String encoded_string) 
	{
		ArrayList<Character> decoded_arraylist = new ArrayList<Character>();
		
		for(int i = 0; i < encoded_string.length() - 1; i++)
		{
			char character = encoded_string.charAt(i + 1);
			char numeral_char = encoded_string.charAt(i);
			int numeral = Character.getNumericValue(numeral_char);
			
			for(int c = 0; c < numeral; c++) {
				decoded_arraylist.add(character);
			}
			i++;
		}	
		
		Character[] decoded_array = new Character[decoded_arraylist.size()];
		for(int i = 0; i < decoded_arraylist.size(); i++) 
		{
			decoded_array[i] = decoded_arraylist.get(i);
		}
		String decoded_string = character_Buffer(decoded_array);
		return decoded_string;
	}
}
