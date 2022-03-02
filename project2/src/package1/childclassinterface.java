package package1;

public class childclassinterface implements interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclassinterface objcc = new childclassinterface();
		objcc.method1();
		objcc.method2();
	}

	@Override
	public void method1() {
		System.out.println("i am in child class from method1: overriden ");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("i am in child class from method2: overriden");

	}

}
