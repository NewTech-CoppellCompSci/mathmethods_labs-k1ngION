package labs;
import java.util.Scanner;



public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Type a positive integer");
		int userNum = inKey.nextInt();
		System.out.println("Type in a positive integer");
		int userNum2 = inKey.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int x1=userNum;
		int x2=userNum2;
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Choose the radius of a cylinder");
		int radius = inKey.nextInt();
		System.out.println("Choose the height of the cylinder");
		int height = inKey.nextInt();
		System.out.println(Math.pow(radius, 2) * height * Math.PI);
		
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter x1");
		double x1 = inKey.nextDouble();
		System.out.println("Enter y1");
		double y1 = inKey.nextDouble();
		System.out.println("Enter x2");
		double x2 = inKey.nextDouble();
		System.out.println("Enter y2");
		double y2 = inKey.nextDouble();
		System.out.println( Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2)));
		
		
	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter A: ");
		double a = inKey.nextDouble();
		System.out.print("Enter B: ");
		double b = inKey.nextDouble();
		System.out.print("Enter  C: ");
		double c = inKey.nextDouble();
		
		System.out.println("x1 = " + ((-1*b + Math.sqrt(Math.pow(b, 2) -4*a*c)) / (2*a) ));
		
		
	}
	
	

	
}

