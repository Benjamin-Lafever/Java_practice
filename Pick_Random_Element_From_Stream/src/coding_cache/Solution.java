package coding_cache;

import java.util.Arrays;
import java.util.Random;

public class Solution {

	/*
	 * It can be solved in O(n) time. The solution
	 * also suits well for input in the form of stream. The idea
	 * is similar to this post. Following are the steps.
	 * 
	 * 1) Create an array reservoir[0...k-1] and copy 
	 * first k items of stream[] to it.
	 * 
	 * 2) Now one by one consider all the items from (k_1)th 
	 * item to nth item.
	 * 
	 * 		a) Generate a random number from 0 to i where i is index
	 * 			of current item in stream[]. Let the generated random 
	 * 			number be j.
	 * 
	 * 		b) If j is in range 0 to k-1, replace reservoir[j] with
	 * 			arr[i] 
	 * 
	 * 			Following is implementation of the above 
	 * 			algorithm:
	 *
	 */
	
	static void selectKItems(int stream[], int n, int k) 
	{
		
		int  i; // index for elements in stream[]
		
		//reservoir[] is the output array. Initialize it with 
		// first k elements from stream[]
		int reservoir[] = new int[k];
		for(i = 0; i < k; i++) 
		{
			reservoir[i] = stream[i];
		}
		
		Random r = new Random();
		
		//Iterate from the (k+1)th element to nth element
		for(; i < n; i++) 
		{
			//pick a random index fomr 0 to i
			int j = r.nextInt(i + 1);
			
			//if the randomly picked index is smaller than k, 
			//then replace the element present at the index with new elements
			//from stream
			if(j < k) 
			{
				reservoir[j] = stream[i];
			}
		}
		
		System.out.println("Following are k randomly selected items");
		System.out.println(Arrays.toString(reservoir));
	}
	
}
