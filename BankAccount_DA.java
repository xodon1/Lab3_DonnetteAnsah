public class BankAccount_DA {

		private double balance;
		private final String accountNumber;

		public void deposit(double amount) {
			if (amount > 0) {
				balance = balance + amount;
				System.out.println("Your deposit was successful.");
		} 
			else 
		{
				System.out.println("This is an invalid deposit amount.");
		}
	}

		public void withdraw(double amount) {
			if (amount > 0 && amount <= balance) {
				balance = balance - amount;
				System.out.println("You withdrew $" + String.format("%.2f", amount) + ". Transaction completed.");
		} 
			else 
		{
				System.out.println("Withdrawal failed, please check your balance and try again.");
			}
		}

		public BankAccount_DA(String accNum, double initialBalance) {
			this.accountNumber = accNum;
			this.balance = initialBalance;
		}

		public double getBalance() {
			return balance;
		}

		public String getAccountNumber() {
			return accountNumber;
		}
	}


