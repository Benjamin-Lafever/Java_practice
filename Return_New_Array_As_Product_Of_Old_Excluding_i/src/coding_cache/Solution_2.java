package coding_cache;

public class Solution_2 {
	
	
	public int[] new_array(int[] array_1) {
		
		int[] array_2 = new int[array_1.length];
		
		int product_holder = 1;
		
		for(int i = 0; i < array_1.length; i++) {
			product_holder = 1;
			for(int c = 0; c < array_1.length; c++) {
				if(array_1[i] != array_1[c]) {
					product_holder *= array_1[c];
					array_2[i] = product_holder;
				}
			}
		}
		return array_2;
	}
}
