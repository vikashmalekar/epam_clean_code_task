import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.err.println("Enter Principal Balnnce: ");
		int principalBalance=scan.nextInt();
		System.err.println("Enter Rate Of interest: ");
		int annualInterest=scan.nextInt();
		System.err.println("Enter Time Period: ");
		int years=scan.nextInt();
		System.err.println("Enter Number of times interest applied per Time period: ");
		int period=scan.nextInt();
		
		
		Interest obj=new Interest();
		Interest obj1=new Interest();
		

		System.err.print(obj.SimpleInterest(principalBalance,annualInterest,years));
		System.err.print(obj1.CompundInterset(principalBalance,annualInterest,period,years));
	}
}
