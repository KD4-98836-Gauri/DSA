package assignment7;

import java.util.Arrays;

public class assignment7_1 {
	public static void InsertionSortDesc(int []arr, int n) {
		for(int i=1; i<n; i++) {
			int temp = arr[i];
			int j;
			for(j=i-1; j>=0; j--) {
				if(arr[j] < temp) {
					arr[j+1] = arr[j];
				}
				else 
					break;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33};
		System.out.println("Before sort : " +Arrays.toString(arr));
	
		InsertionSortDesc(arr, arr.length);
		System.out.println("After sort DESC : " +Arrays.toString(arr));
	}
}
