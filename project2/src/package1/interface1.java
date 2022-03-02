package package1;

public interface interface1 {

	int a = 10;
	float b = 0.2f;
	char c = 'k';
	boolean status= true;
	
	public void method1();
	
	public void method2();
	
	public static void main(String[] args) {
		interface1 obji;
		obji = new childclassinterface();
		obji.method1();
		obji.method2();
		System.out.println("values: " + status);
	}
}
