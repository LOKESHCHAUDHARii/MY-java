package Lab;

public class Calculation {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter 1 number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2 number");
		int num2 = sc.nextInt();
		System.out.println("Enter 1 for Add");
		System.out.println("Enter 2 for Sub");
		System.out.println("Enter 3 for Multiply");
		System.out.println("Enter 4 for Divide");
		int c =sc.nextInt();
		if(c==1) {
			System.out.println(num1+num2);
		}

		else if(c==2) {
			System.out.println(num1-num2);
		}

		else if(c==3) {
			System.out.println(num1*num2);
		}

		else if(c==4) {
			System.out.println(num1/num2);
		}else {
			System.out.println("Invalid Input");
		}
	
	}

}
