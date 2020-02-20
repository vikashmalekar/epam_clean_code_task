package mainClass;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.err.println("Select (1200/1500/1800/2500) cost of One Square Feet: ");
		int cost=scan.nextInt();
		if (cost==1200) {
			System.err.println("Enter the Area: ");
			double Area=scan.nextInt();
			specialClass obj=new specialClass();
			System.err.print(obj.Standard(Area));
		}
		else if  (cost==1500) {
			System.err.println("Enter the Area: ");
			double Area=scan.nextInt();
			specialClass obj=new specialClass();
			System.err.print(obj.AboveStandard(Area));
		}
		else if  (cost==1800) {
			System.err.println("Enter the Area: ");
			double Area=scan.nextInt();
			specialClass obj=new specialClass();
			System.err.print(obj.HighStandard(Area));
		}
		else if  (cost==2500) {
			System.err.println("Enter the Area: ");
			double  Area=scan.nextInt();
			specialClass obj=new specialClass();
			System.err.print(obj.HighStandardandAutomated(Area));
		}		
		
	}

}
