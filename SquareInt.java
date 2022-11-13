package Day13;

import java.util.Arrays;

public class SquareInt {
	public static void main(String[] args) {
		System.out.println(squares(3, 9));
	}
	
	public static int squares(int a, int b) {
//		int[] array = new int[b - a + 1];
//		array[0] = a;
//		for (int i = 1; i < array.length; i++) {
//			array[i] = array[i-1] + 1;
//		}
//		for (int i = (int) Math.round(Math.sqrt(a)); i <= Math.round(Math.sqrt(b)); i++) {
//			int c =  Arrays.binarySearch(array, i*i);
//			if(c > 0)
//				System.out.println(i*i);; 
//		}
//		return 0;
		int count = 0;
		for (int i = (int) Math.round(Math.sqrt(a)); i <= Math.round(Math.sqrt(b)); i++) {
			if (i*i >= a && i*i <= b) {
				count++;
			}
			
		}
		return count;
	}
	
	
//		
//	}
}
