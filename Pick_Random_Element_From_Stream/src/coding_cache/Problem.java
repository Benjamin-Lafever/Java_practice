package coding_cache;

public class Problem {

	/* 
	 * Problem: problem of uniformly picking a random
	 * element form a gigatic stream. This is a common interview
	 * quesiton from companies like google and facebook
	 * 
	 * Naively, we could process the stream and store all the 
	 * elements we encounter in a list, find its size, and pick a 
	 * random element form [0, size - 1]. The problem with this approach 
	 * is that it would take O(N) space for a large N.
	 * 
	 * Instead, let's attempt to solve using loop invariants. On the ith iteration
	 * of our loop to pick a random element, let's assume we already picked 
	 * an alement uniformly form [0, i - 1]. In order to maintain 
	 * the loop invariant, we would need to pick the ith element as the new
	 * random element at 1 / (i + 1) chance. For the base case where 
	 * i = 0, let's say the random element is the first one. then we know it works
	 * because 
	 * 	
	 * 	- For i = 0, we would've picked uniformly from [0, 0].
	 * 	- For i > 0, before the loop began, any element K in [0, i - 1] had 1 / i
	 * chance of being chosen as the random element. We want K to have 
	 * 1 / (i + 1) chance of being chosen after the iteration.
	 * This is the case since the chance of having being chosen 
	 * already but not getting swapped with the ith element is 
	 * 1 / i * (1 - ( 1 / ( i + 1 ))) which is 1 / i * i / ( i + 1 ) or
	 * 1 / ( i + 1 )
	 * 
	 * Here is a code example:
	 * 
	 * import random
	 * 
	 * def pick(big_stream):
	 * 	random_element = None
	 * 
	 * 	for i, e in enumerate(big_stream):
	 * 		if i == 0:
	 * 			random_element = e
	 * 		if random.radint(1, i + 1) == 1:
	 * 			random_element = e
	 * 	return ramdom_element
	 * 
	 * 
	 * Since we are only storing a single variable, this only takes up
	 * constant space!
	 * 
	 * Turn out this algoroth is call Resivoir Sampling. 
	 */
	
	//Driver program to test solution
	public static void main(String[] args) 
	{
		int stream[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int n = stream.length;
		int k = 5;
		Solution.selectKItems(stream, n, k);
	}
	
}
