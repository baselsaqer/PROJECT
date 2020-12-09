package fast;
import java.util.Scanner;
public class fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter your speed between 80 - 120: ");
		Scanner Scanner = new Scanner(System.in);
		
		if(Scanner.hasNextInt()) {
			int number = Scanner.nextInt();
			fastNumber(number);
		}else {
			System.out.print("Invalid Input, (Enter an Integers between 80 - 120 )");
			
		}
		

	}
	 static  void fastNumber(int number) {
		 
		 int [] FastTest = {80,90,100,120};
	
		 for(int i = 0; i < FastTest.length; i++)
		 {
			 if(FastTest[i] == number & number == 120)
			 {
				 System.out.println("your driving is fast");
				 break;
			 }else if(FastTest[i] == number & number >= 90 )
			 {
				 System.out.println("your driving so good");
				 break;
			 }else if(FastTest[i] == number & number < 80)
			 {
				 System.out.println("your driving is slow");
				 break;
			 }
		 }
	
	}

}
