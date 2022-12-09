 /*Develop
a Java program to create a class Bank that maintains two kinds of account for
its customers, one called savings account and the other current account. The
savings account provides compound interest and withdrawal facilities but no
cheque book facility. The current account provides cheque book facility but
no interest. Current account holders should also maintain a minimum balance
and if the balance falls below this level, a service charge is imposed.

Create a class Account that stores customer name, account number
and type of account. From this derive the classes Cur-acct and Sav-acct to
make them more specific to their requirements. Include the necessary methods
in order to achieve the following tasks:

a)     Accept deposit from customer and update the
balance.
b)     Display the balance.
c)     Compute and deposit interest
d)     Permit withdrawal and update the balance

Check for the minimum balance, impose penalty if necessary and
update the balance. */

import java.util.Scanner;
import java.lang.Math;

class Account
{
	String cname, accNo;
	int typeOfAcc;
	double balance=0, depo, withdraw;
	void set()
	{
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter your name, account number");
		cname = ss.nextLine();
		accNo = ss.next();
		System.out.println("Enter the balance");
		balance = ss.nextDouble();
		System.out.println("The balance in the account is "+balance);
 	}
	void check()
	{
		Scanner ss= new Scanner(System.in);
		System.out.println("Choose the account type 1 for savings account. 2 for current account");
		typeOfAcc = ss.nextInt();
	}
 
}

class Cur_acct extends Account
{
 	double minBal,penalty;
 	Cur_acct()
	{
 	minBal=1000;
 	}

 	void Penalty()
	{
 		penalty=200;
		Scanner sc= new Scanner(System.in);
  		if(balance<minBal)
		{		
			int n;
			System.out.println("A Service charge of "+penalty+" will be charged as the balance will become less than minimum balance\nDo you want to proceed?");
			System.out.println("1.Yes\n 2.No");
			n = sc.nextInt();
			if(n==1)
				balance=balance-penalty;
			else
				System.out.println("Withdraw canceled");

		}
 	}
	void deposit()
	{
  		Scanner sc= new Scanner(System.in);
  		System.out.println("Enter the amount you want to deposit ");
  		depo = sc.nextDouble();
  		balance+=depo;
		display();
 	}
	void withdrawl()
	{
  		Scanner sss= new Scanner(System.in);
  		System.out.println("Enter the amount you want to withdraw ");  
  		withdraw = sss.nextDouble();
  		if(withdraw<balance){
  		balance=balance-withdraw;}
 		else
 		{System.out.println("Insufficient balance");}
		display();
 	}
	
	void display()
	{
		Penalty();
		System.out.println("Name:"+cname+" Account number:"+accNo);
		System.out.println("The balance in the account is " + balance);
	}
}

class Sav_acct extends Account
{
 	void intrest()
	{	
		double r,n,t;
		Scanner sss= new Scanner(System.in);
  		System.out.println("Enter the rate of interest ");  
  		r = sss.nextDouble();
		System.out.println("Enter the number of times interest is compounded per year ");  
  		n = sss.nextDouble();
		System.out.println("Enter the time in years ");  
  		t = sss.nextDouble();
  		balance=balance*Math.pow((1+r/n),(n*t));
		System.out.println("A Compound interest was added");
		display();
 	}

	void deposit()
	{
  		Scanner sc= new Scanner(System.in);
  		System.out.println("Enter the amount you want to deposit ");
  		depo = sc.nextDouble();
  		balance+=depo;
		display();
 	}

	void withdrawl()
	{
  		Scanner sss= new Scanner(System.in);
  		System.out.println("Enter the amount you want to withdraw ");  
  		withdraw = sss.nextDouble();
  	  	if(withdraw<balance){
  		balance=balance-withdraw;}
 		else
 		{System.out.println("Insufficient balance");}
		display();
 	}

	void display()
	{
		System.out.println("Name:"+cname+" Account number:"+accNo);
		System.out.println("The balance in the account is " + balance);
	}
}

class Bank
{
	public static void main(String args[])
	{
	Scanner ss = new Scanner(System.in);
	int op;
	Account a = new Account();
	a.check();
	Sav_acct s = new Sav_acct();
    	Cur_acct c = new Cur_acct();
	System.out.println("The balance in the account is "+a.balance);
  	if(a.typeOfAcc==1)
	{
		s.set();
  		while(true)
		{
			System.out.print("Enter the choice: \n1. Display\n2. Deposit\n3. Withdraw\n4. Compound Intrest\n5. Exit\n");
			op=ss.nextInt();
			switch(op)
			{
			case 1:s.display();
 				break;
			case 2:s.deposit();
 				break;
			case 3:s.withdrawl();
 				break;
			case 4:s.intrest();
 				break;
			case 5:System.exit(0);
			default: System.out.println("Wrong choice ");
		}
   		}
  	}
 	else if(a.typeOfAcc==2)
	 {    
		c.set();
  		while(true)
		{
		System.out.print("Enter the choice: \n1. Display\n2. Deposit Check\n3. Withdraw Check\n4. Exit\n");
		op=ss.nextInt();
		switch(op)
		{
		case 1:c.display();
 			 break;
		case 2:c.deposit();
 			break;
		case 3:c.withdrawl();
 			break;
		case 4:System.exit(0);
		default: System.out.println("Wrong choice ");
		}
  		}
  	}
 	else{
  	 System.out.println("Wrong choice ");
  	}
 }
}
