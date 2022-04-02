package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter in a positive integer");
		int usernum = inKey.nextInt();
		System.out.println("Enter in a positive integer again");
		int usernum1 = inKey.nextInt();
		
		System.out.println(usernum +"^"+ Math.pow(usernum,usernum1));
			
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Type in a positive integer");
		int userNum = inKey.nextInt();
		
		System.out.println("The square root of the number " + userNum + " is " + Math.sqrt(userNum));
		
		
	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("What's the side A of a right triangle");
		int usernum = inKey.nextInt();
		System.out.println("What's the B side of a right triangle");
		int usernum1 = inKey.nextInt();
		
		System.out.println("Hypotenuse = " + Math.sqrt(Math.pow(usernum, 2)+(Math.pow(usernum1, 2))));

	}


	
	
	public static void problem04() {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MIN_VALUE;
		Scanner inKey1 = new Scanner(System.in);
		int userNum = 1;
		boolean not0 = true;
		
		while (not0) {
			System.out.println("Type in an integer.");
			userNum = inKey1.nextInt();
			if (userNum == 0) {
				not0 = false;
			}
			else {
				if (userNum > max) {
					max = userNum;
				}
				else if (userNum < min) {
					min = userNum;
				}
			}
		System.out.println(max);
			System.out.print(min + "\n");
		}
		
	}
	
	
	
	
	
	
}
