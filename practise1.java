package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class practise1 {
	
	public static void main(String args[]) {
		
		new practise1(); 
		
		for(int i=51; i <= 77; i++ ) {
			if(i%2!=0)
			System.out.println(i);
		}
		
		int[] num= {22,67,98,1,34,58,99};
		int count=num.length;
		Arrays.sort(num);
	System.out.println("2nd large num" +num[count-2]);
	
	}
	
	
}
