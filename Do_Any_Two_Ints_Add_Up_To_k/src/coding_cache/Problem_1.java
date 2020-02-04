package coding_cache;

public class Problem_1 {

	public static void main(String[] args) {
		
		/*
		 * Problem: Easy
		 * 
		 * Given a list of numbers and a number k, return whether any two
		 * numbers from a lost add up to k
		 * 
		 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 = 17
		 * 
		 */
		
		
		Solution_1 sol = new Solution_1();
		
		Boolean answer = false;
		int[] list = new int[] { 10, 15, 3, 7};
		int k = 17;
		
		answer = sol.true_or_false(list, k);
		System.out.println(answer);
		
	}
}

