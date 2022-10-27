package hijava.practice;

public class HelloJava {
	int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		HelloJava hj = new HelloJava();
		System.out.println("x = " + hj.x);
		System.out.println("x = " + hj.y);
		swap(hj);
		System.out.println("x = " + hj.x);
		System.out.println("x = " + hj.y);
	}

	public static void swap(HelloJava hj) {
		int temp = hj.x;
		hj.x = hj.y;
		hj.y = temp;
	}
}
