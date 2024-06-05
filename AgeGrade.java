import java.util.Scanner;
public class AgeGrade
{
	public static void main (String[]args)
	{
		Scanner age = new Scanner (System.in);
		System.out.print("ENTER YOUR AGE:  ");
		int AGE = age.nextInt();
		if (AGE >= 65)  
			System.out.print("You are a SENIOR");
				
		else if (AGE>=26)
			System.out.print("You are an ADULT");
			  
		else if (AGE>=20)
			System.out.print("You are a YOUNG ADULT");
			
		else if (AGE>=13)
			System.out.print("You are a TEENAGER");
			 
		else if (AGE>=11)
			System.out.print("You are a PRETEEN");
			 
		else if (AGE>=5)
			System.out.print("You are a CHILD");
			 
		else if (AGE>=0)
			System.out.print("You are a TODDLER");
	 
		else 
			System.out.print("INPUT AGE");
			
			
	}
	
	
}
