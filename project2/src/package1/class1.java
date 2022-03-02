package package1;

public class class1 {
	public int x = 100;
	// int account_numbers[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is from class1");
		method1();
	}
	
	public static void method1() 
	{
		int x = 20;
		System.out.println("this is the method1 from class1");
		class1 obj1 = new class1();
		System.out.println(x);
		System.out.println(obj1.x);
	}
	
	public void method2() {
		System.out.println("this is from method2: ");
	}
	
	
}
