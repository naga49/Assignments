package week1.day2;

public class Fibnoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//int count=0 1 1 2 3 5 8 13 21 35 56 
		
		int firstNo = 0, SecNo = 1;
		System.out.println(firstNo);
		System.out.println(SecNo);
		for (int i = 0; i <=11; i++) {
			
			int sum=firstNo+SecNo;
			
			firstNo=SecNo;
			
			SecNo=sum;
			
			System.out.println(sum);
			
		}
	
	}


}
