// demonstra if else statement of 5 subjects.the person who gets above 60% will be

// passed otherwise failed.output should be like enter your name enter marks for 5 subjects

// Name : lokesh chaudhari
// date : 11-10-22




package lokesh;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = sc.next();
		
		System.out.print("Enter your english marks: ");
		int a=sc.nextInt();
		System.out.print("Enter your hindi marks: ");
		int b=sc.nextInt();
		System.out.print("Enter your mathematics marks: ");
		int c=sc.nextInt();
		System.out.print("Enter your science marks: ");
		int d=sc.nextInt();
		System.out.print("Enter your SST marks: ");
		int e=sc.nextInt();
		
			int per = ((a+b+c+d+e)/5);
			System.out.println(per);
			if(per>=60)	{
				
				System.out.println("Your are pass ");
				
			}
			else	{
				System.out.println("You are failed ");
			}
				
		
	}

	{


	}

}
