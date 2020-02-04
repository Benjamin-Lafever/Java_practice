package coding_cache;

public class Solution_1 {

	Boolean answer = false;
	
	
	public Boolean true_or_false(int[] list, int k) {
		
		int length = list.length - 1;
		int number_holder = 0;
		
		for(int c = 0; c <= length; c++){
			for(int i = 0; i <= length; i++) {
				if(i <= c) {
					i = c + 1;
				}
				if( i > length) {
					break;
				}
				number_holder = list[c] + list[i]; 
				if( k == number_holder) {
					answer = true;
				}
			}
		}	
		return answer; 
	}
}


		

