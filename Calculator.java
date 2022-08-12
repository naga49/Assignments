package week1.day2;

public class Calculator {
	
	public int subTwoNum(int  a, int b, int c)
	{
		int d = a+b+c;
		 System.out.println(d);
		return d;
	}

	public int subNum (int num1, int num2){
		
		int num3=num1-num2;
		System.out.println(num3);
		return num3;
	
	}
	public double mulNum(double num1, double num2) {
		double num3=num1*num2;
		System.out.println(num3);
		return num3;
		
	}
	
	public float divide(float num1, float num2) {
		
		float num3=num1+num2;
		System.out.println(num3);
		return num3;
	}
	
	public static void main() {
		
		Calculator obj= new Calculator();
		int eng = obj.subTwoNum(3,4,5);
		System.out.println(eng);
		int eng1 = obj.subNum(3,4);
		System.out.println(eng1);
		double store = obj.mulNum(78.584, 87.45);
		System.out.println(store);
		float tar= obj.divide(548.84f, 8.7f);
		System.out.println(tar);
		
	}
	
}
,,