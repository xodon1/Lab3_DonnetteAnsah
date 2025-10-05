public class SavingsAccount_DA extends BankAccount_DA {

    @Override
    public void withdraw(double amount)
    {
        if (getBalance() - amount < 50)
        {
            System.out.println("Withdrawal failed. A minimum balance of $50 is required.");
      }
        else
      {
            super.withdraw(amount);
        }
    }

    public SavingsAccount_DA(String accNum, double initialBalance)
    {
        super(accNum, initialBalance);
    }
}



