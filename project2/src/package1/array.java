package package1;

public class array {
	int a[];
	float b[];
	char c[];
	int d[] = {};
	int e[] = {10,20,30};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
		float[] b = new float[2];
		char[] c = new char[3];
		int[] d = new int[2];
		int[] e = new int[4];
		a[0] = 12;
		a[1] = 22;
		a[2] = 32;
		a[3] = 42;
		System.out.println("values of integer a[0]: " +  a[0]);
		System.out.println("values of integer a[1]: " +  a[1]);
		System.out.println("values of integer a[2]: " +  a[2]);
		System.out.println("values of integer a[3]: " +  a[3]);
		c[0]='x';
		c[2]='z';
		System.out.println("values of char c[0]: " +  c[0]);
		System.out.println("values of char c[1]: " +  c[1]);
		System.out.println("values of char c[2]: " +  c[2]);
b[0]=10.2f;
b[1]=20.2f;
System.out.println("values of float b[0]: " +  b[0]);
System.out.println("values of float b[0]: " +  b[1]);
// System.out.println("values of float b[0]: " +  b[3]);
	System.out.println("values of int d[0]: " +  d[0]);
	System.out.println("values of int e[0]: " +  e[0]);
	System.out.println("values of int e[1]: " +  e[1]);
	System.out.println("values of int e[2]: " +  e[2]);




	}

}
