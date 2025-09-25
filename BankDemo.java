import java.io.*;
import java.lang.*;

class BankDemo
{
	public static void main(String args[])
	{
	  CheckingAmount obj=new ChechkingAmount(101);
	  obj.deposite=500;

	  System.out.println("account number="+obj.getnumber());

	  System.out.println("balance amount="+obj.getbalance())

	  try
	  {
	    obj.withdraw(100);
	    obj.withdraw(500);

	  }
	  catch(InsufficientAmt e)
	  {
	    System.out.println("Insufficient amount exception raised ="+e.getamount());
	    e.printStackTrace();
	  }
	  System.out.println("balance amount ="+obj.getbalance());
	  	}
}