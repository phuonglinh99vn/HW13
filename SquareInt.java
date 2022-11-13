package Day13;

import java.util.Arrays;

public class SquareInt {
	public static void main(String[] args) {
		System.out.println(squares(3, 9));
	}
	
	public static int squares(int a, int b) {
		
		int count = 0;
		for (int i = (int) Math.round(Math.sqrt(a)); i <= Math.round(Math.sqrt(b)); i++) {
			if (i*i >= a && i*i <= b) {
				count++;
			}
			
		}
		return count;
	}

}
