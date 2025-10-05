import java.util.Scanner;

public class DriverMainClass_DonnetteAnsah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner input = new Scanner(System.in);

		        System.out.print("Please provide the first account number: ");
		        String acc1 = input.nextLine();
		        BankAccount_DA a1 = new BankAccount_DA(acc1, 1500);

		        System.out.println("Run 1 ");
		        System.out.println("-----");
		        a1.deposit(1000);
		        System.out.println("New balance is: $" + String.format("%.2f", a1.getBalance()));
		        System.out.println(" ");
		        
		        System.out.println("Run 2");
		        System.out.println("-----");
		        a1.withdraw(600);
		        System.out.println("New balance is: $" + String.format("%.2f", a1.getBalance()));
		        System.out.println(" ");

		        System.out.println("Run 3");
		        System.out.println("-----");
		        a1.withdraw(2500);
		        System.out.println("Failed transaction. Your current balance is: $" + String.format("%.2f", a1.getBalance()));
		        System.out.println(" ");
		        
		        System.out.print("Please provide your second account number: ");
		        String acc2 = input.nextLine();
		        BankAccount_DA a2 = new BankAccount_DA(acc2, 300);
		        a2.deposit(50);
		        System.out.println("Your updated balance is: $" + String.format("%.2f", a2.getBalance()));
		        System.out.println(" ");
		        
		        System.out.print("Please provide your Savings Account number: ");
		        String acc3 = input.nextLine();
		        SavingsAccount_DA s1 = new SavingsAccount_DA(acc3, 200);

		        System.out.println("SavingsAccount Test- $50 Minimum Balance");
		        s1.withdraw(170); // should be blocked
		        System.out.println("Savings balance: $" + String.format("%.2f", s1.getBalance()));
		        s1.withdraw(120); // should work
		        System.out.println("Savings balance: $" + String.format("%.2f", s1.getBalance()));

		        input.close();

		  }
	}

