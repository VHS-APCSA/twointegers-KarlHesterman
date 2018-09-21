import java.util.Scanner;
public class TwoIntegersRunner 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two separate integers:");
		int integer1 = input.nextInt();
		int integer2 = input.nextInt();
		TwoIntegers twoIntegers = new TwoIntegers(integer1, integer2);
		String Arithmetic = twoIntegers.Arithmetic();
		System.out.println(Arithmetic);
		String Larger = twoIntegers.Larger();
		System.out.println(Larger);
		boolean isEven = twoIntegers.isEven();
		System.out.println("The sum of the two numbers is even: " + isEven);
		boolean Multiple = twoIntegers.Multiple();
		System.out.println(Multiple);
	}

}
 