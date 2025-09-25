//checking amount
import java.io.*;
import java.lang.*;

class CheckingAmount
{
	private double balance;
	private int number;

	public CheckingAmount(int number)
	{
	  this.number=number;
	}
	public void deposite(double amount)
	{
	 balance=balance+amount;
	}
	public void withdraw(double amount)throws InsufficientAmt
	{
	if(amount<=balance)
	{
	 balance=balance-amount;
	}
	else
	{
	  double needs=amount-balance;
	  throw new InsufficientAmt(needs);
	}
	}
	public double getbalance()
	{
	  return balance;
	}
	public int getnumber()
	{
	  return number;
	}
}

