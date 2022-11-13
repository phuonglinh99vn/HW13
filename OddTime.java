package Day13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OddTime {
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6,1,2,3,4,5,100,400,15,15,15,15,15,15,15,15};
		
		findOddTimesAppearNum(array);
	}
	
	public static int findOddTimesAppearNum(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			} else {
				int count = map.get(arr[i]);
				count++;
				map.put(arr[i], count);				
			}
		}
		Set<Integer> keys = map.keySet();
		
		for (Integer key : keys) {
			if (map.get(key) % 2 != 0) {
				System.out.println(key);
			}
		}
		return 0;
	}
}
