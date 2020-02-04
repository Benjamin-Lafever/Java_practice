package coding_cache;

public class Problem_2 {

	/*
	 * Problem: Hard
	 * 
	 * Given an array of integers, return a new array such that each element
	 * at index i of the new array is the product of all the numbers in 
	 * the original array except the one at i
	 * 
	 * For example, if our input was [1, 2, 3, 4, 5], the expected output 
	 * should be [120,  60, 40, 30, 24]. If our input was [3, 2, 1] the output 
	 * should be [2, 3, 6].
	 */
	
	
	public static int[] array_1 = new int[] {3, 2, 1};
	public static Solution_2 sol_2 = new Solution_2();
	
	public static void main(String[] args) {
		
		int[] array_2 = new int[array_1.length];
		
		array_2 = sol_2.new_array(array_1);
		for(int i: array_2) {
			
			System.out.println(i);
		}
	}
}
