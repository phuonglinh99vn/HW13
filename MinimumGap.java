package HW10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumGap {
	
	public static void main(String[] args) {
		int[] array = new int[] { 7, 5, 4, 7, 6, 7, 5 };
		
		System.out.println(findminGap(array));
	}	

	
	public static int findminGap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int minGap = arr.length;
		boolean isFound = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], i + 1);
			} else {
				isFound = true;
				minGap = Math.min(minGap, i + 1 - map.get(arr[i]));
				map.put(arr[i], i + 1);
				
			}
		}
		if (isFound) return minGap;
		else return 0;
	}
	
}

//boolean isFound = false;
//int minGap = array.length;
//for (int i = 0; i < array.length; i++) {
//	for (int j = i + 1; j < array.length; j++) {
//		if (array[i] == array[j] && minGap > j - i) {
//			minGap = j - i;
//				bre;
//		}
//	}
//		
//int[] arrGap = new int[maxValue(array)+1];
//int[] index = new int[maxValue(array)+1];		
//for (int j = 0; j < arrGap.length; j++) {
//	arrGap[j] = array.length;
//}	
//
//for (int i = 0; i < array.length; i++) {
//	
//	if (index[array[i]] != 0) {
//		isFound = true;
//		arrGap[array[i]] = Math.min(arrGap[array[i]], i - index[array[i]] + 1);
//	}
//	index[array[i]] = i + 1;
//}
//if (isFound = false) {
//	System.out.println(0);
//} else System.out.println(minGap(arrGap));	
//}
//
//public static int minGap(int[] arrGap) {
//int minGap = 10000;
//for (int a : arrGap) {
//	if (a > 0 && minGap > a) {
//		minGap = a;
//	}
//}
//return minGap;
//}
//
//public static int maxValue(int[] array) {
//int maxValue = array[0];
//for (int a : array) {
//	if (maxValue < a) {
//		maxValue = a;
//	}
//}
//return maxValue;
//}

