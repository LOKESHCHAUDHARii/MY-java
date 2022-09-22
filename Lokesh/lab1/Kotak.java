package Inheritance;

	public class Kotak extends Banks {

		
		void Banklocation()			
		{
			System.out.println("The Bank Location KALYAN");
		}
		void Bank_client_name()
		{
			super.Bank_client_name();
			System.out.println("lokesh,Shivam,Monika");
		}
		

	}
