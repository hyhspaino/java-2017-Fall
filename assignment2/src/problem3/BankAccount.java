package problem3;

/**
A bank account has a balance that can be changed by 
deposits and withdrawals.
*/
public class BankAccount
{  
private double balance;
private int charge;
private int monthly_transactions;
/**
   Constructs a bank account with a zero balance.
*/
public BankAccount()
{   
   balance = 0;
   charge=5;
   monthly_transactions=5;
}

/**mutator method
   Constructs a bank account with a given balance.
   @param initialBalance the initial balance
   
*/
public BankAccount(double initialBalance)
{   
   balance = initialBalance;
}

/**
   Deposits money into the bank account.
   @param amount the amount to deposit
*/
public void deposit(double amount)
{  
	if (monthly_transactions<0)
		balance = balance + amount-charge;
    else
    	balance = balance + amount;
	monthly_transactions--;
}

/**
   Withdraws money from the bank account.
   @param amount the amount to withdraw
*/
public void withdraw(double amount)
{   if (monthly_transactions<0)
		balance = balance - amount-charge;
	else
		 balance = balance - amount;
	monthly_transactions--;
}

/**accessor method
   Gets the current balance of the bank account.
   @return the current balance
   
*/
public double getBalance()
{   
   return balance;
}
/**
reset the transaction times in a new month
*/
public void new_month()
{
   monthly_transactions=5;	
}
}
