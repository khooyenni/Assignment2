import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your age:");
		int age = in.nextInt();
		System.out.println("Age : " + age);
		System.out.println();
		
		if(age>=20) {
			System.out.print("Congratulation, you are eligible to apply the bussiness loan." );
			System.out.println();
		}else
			System.out.print("Sorry, you are not eligible to apply the bussiness loan.");
		System.out.println();
		
		System.out.print("Enter you name: ");
		String name = in.next();
		
		System.out.print("Enter your citizenship:");
		String citizenship = in.next();
		
		
		System.out.print("Enter your Home Address:");
		String home = in.next();
		
		String[] question= {"Name","Citizenship","Home Address"};
		String[] answer = {name, citizenship, home};
		
		int i=0;
		while(i<question.length){
			System.out.println(question[i]+": "+ answer[i]);
			i++;
		}
		System.out.println();
		
		
		System.out.println("Type of Business Loan Provide: ");
		String loan1 = in.next();
		String loan2 = in.next();
		String loan3 = in.next();
		
		String[]LoanProvide= {loan1, loan2, loan3};
		int j=0;
		do {
			System.out.println("Type of Business Loan Provide: " + LoanProvide[j]);
			j++;
		}while(j<LoanProvide.length);
		System.out.println();
		
		String[]loan= {"more or equal than RM10000","less than RM10000",};
		String [] interest = {"6%", "7%"};
		for(int k=0; k<loan.length;k++) {
			System.out.print("Interest of " + loan[k] +": "+ interest[k]);
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Enter the amount borrowed: ");
		int amount = in.nextInt();
		System.out.println("Amount borrowed : " + "RM" + amount);
		System.out.println();
		
		System.out.println("The number of months to pay the loan back: ");
		int months = in.nextInt();
		System.out.println("The number of months to pay the loan back : " + months + "months");
		System.out.println();
		
		
		int interest1 = 6;
		int interest2 = 7;	
		if(amount>=10000) {
			System.out.println("Interest per year is : " + interest1 + "%");
		}else if(amount<10000){
			System.out.println("Interest per year is : " + interest2 + "%");
		}
		System.out.println();
		
		double rate1 = amount * (0.06/12);
		double rate2 = amount * (0.07/12);
		if(amount>=10000) {
			System.out.printf("Total interest per month : RM%.2f ", rate1);
		}else if(amount<10000){
			System.out.printf("Total interest per month : RM%.2f ", rate2);
		}
		System.out.println();
		
		double tinterestloan1 = months * rate1;
		double tinterestloan2 = months * rate2;
		if(amount>=10000) {
			System.out.printf("Total interest per loan : RM%.2f ", tinterestloan1);
		}else if(amount<10000){
			System.out.printf("Total interest per loan : RM%.2f ", tinterestloan2);
		}
		System.out.println();
		
		double mpayment1 = rate1 + (amount/12);
		double mpayment2 = rate2 + (amount/12);
		if(amount>=10000) {
			System.out.printf("Monthy payment  : RM%.2f ", mpayment1);
		}else if(amount<10000){
			System.out.printf("Monthy payment  : RM%.2f ", mpayment2);
		}
		System.out.println();
		
		double tpayback1 = tinterestloan1+ amount;
		double tpayback2 = tinterestloan1+ amount;
		if(amount>=10000) {
			System.out.printf("Total borrowing cost : RM%.2f ", tpayback1);
		}else if(amount<10000){
			System.out.printf("Total borrowing cost : RM%.2f ", tpayback2);
		}
		System.out.println();
		
		System.out.println("Please come again and thank you for choosing us. ");
		

	}

}
