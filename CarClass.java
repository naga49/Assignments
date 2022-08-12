package week1.day2;

public class CarClass {

	public void carName() {
		System.out.println("Tata Altroz");
	}
	
	public String getColor() {
		return "white";
	}
	
	public int getEngineNumber() {
		return 423434663;
	}
	public int subTwoNum(int a, int b) {
		int c = a-b;
		return c;
	}
	public int mulTwoNum(int a, int b) {
		int c = a*b;
		return c;
	}
	public int divTwoNum(int a, int b) {
		int c = a/b;
		return c;
		
	}
	public static void main (String args[]) {
		CarClass obj= new CarClass();
		obj.carName();
		String color = obj.getColor();
		System.out.println(color);
		int engine = obj.getEngineNumber();
		System.out.println(engine);
		int sum = obj.subTwoNum(2,5);
		System.out.println(sum);
		int mul = obj.mulTwoNum(5, 9);
		System.out.println(mul);
		int divi=obj.divTwoNum(25,25);
		System.out.println(divi);
	}
	
}


