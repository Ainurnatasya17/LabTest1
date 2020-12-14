package Array1Dimensional;

import java.util.Scanner;

public class LabTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("*****QUESTION 1*****");
		
		int numberitems, q1, q2, q3;
		double totalprice1, totalprice2, totalprice3, totalprice, disc, price1, price2, price3;
		
		System.out.print("Enter number of items: ");
		numberitems = input.nextInt();
		System.out.print("Enter price for first item: RM");
		price1 = input.nextDouble();
		System.out.print("Enter quantity for first item: ");
		q1 = input.nextInt();
		System.out.println();
		
		totalprice1 = price1*q1;
		
		System.out.print("Enter price for second item: RM");
		price2= input.nextDouble();
		System.out.print("Enter quantity for second item: ");
		q2 = input.nextInt();
		System.out.println();
		
		totalprice2 = price2*q2;
		
		System.out.print("Enter price for third item: RM");
		price3 = input.nextDouble();
		System.out.print("Enter quantity for third item: ");
		q3 = input.nextInt();
		System.out.println();
		
		totalprice3 = price3*q3;
		totalprice = totalprice1 + totalprice2 + totalprice3;
		System.out.println("Total Price   : RM" + totalprice);
		
		if(totalprice > 100) {
			disc = (totalprice*0.2);
				
		}else
			disc = (totalprice*0.1);
		
		System.out.println("Discount received : RM" + disc);
		System.out.println("Price to be paid  : RM" + (totalprice - disc));
		System.out.println();
	
		
		System.out.println("*****QUESTION2*****");
		
		double sales, commission, dailywages;
		int hours;
		
		System.out.print("Enter Sales : RM");
		sales = input.nextDouble();
		System.out.print("Enter Hours Worked :");
		hours = input.nextInt();
		
		if(sales >= 150 && sales <= 300) {
			commission = (sales*0.5);
			
		}else if(sales > 300 && sales <= 500) {
			commission = (sales*0.10);
			
		}else
			commission = (sales*0.15);
		
		dailywages = (hours*5) + commission;
		
		System.out.println();
		System.out.println("Commission : RM" + commission);
		System.out.println("Daily Wages : RM" + dailywages);	
	
	}

}
