package week1.day2;

public class Intersec {
	
	public static void main(String[] args) {

	int[] first= {3,2,11,4,6,7};
	int[] second= {1,2,8,4,9,7};
	
	int a=first.length;
	
	int b = second.length;
	
	for (int i=0; i<a;i++) {
		
		for(int j=0; j<b;j++) {
			
			if (first[i]==second[j]) {
				
			System.out.println(second[i]);
				
			}
}
		}
	}}
