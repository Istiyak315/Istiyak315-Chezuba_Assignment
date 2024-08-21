package Java;

import java.util.Arrays;

public class Problem1 {
	
	public static int[] InreamentOne(int[] arr) {
		
		
		int n=arr.length;
		
		for(int i=n-1; i>=0; i--) {
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}
			
			arr[i]=0;
		}
		
		int[] newArr = new int[n+1];
		newArr[0]=1;
		
		return newArr;
		
		
		
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		System.out.println("Input :" + Arrays.toString(arr));
		
		int[] res = InreamentOne(arr);
		System.out.println("Output :" + Arrays.toString(res));
	}

}
