import java.util.Scanner;
/* Using IntelliJ, write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
below 1000$	N/A
Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.*/

public class CommissionCalculator {

	public static void main(String[] args) {
		
		int sale_fig;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Sales Figure : ");
		sale_fig = sc.nextInt();
		
		if(sale_fig > 10000)
		{
			sale_fig = (sale_fig /100)*30;
			System.out.println("Commission : " +sale_fig);
		}
		else if(sale_fig >= 5001 && sale_fig <= 9999)
		{
			sale_fig = (sale_fig /100)*20;
			System.out.println("Commission : " +sale_fig);
		}
		else if(sale_fig >= 5001 && sale_fig <= 9999)
		{
			sale_fig = (sale_fig /100)*10;
			System.out.println("Commission : " +sale_fig);
		}
		else
		{
			System.out.print("Commission N/A");
		}
		sc.close();
	}
}
