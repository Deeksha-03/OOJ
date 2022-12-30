

import java.util.*;
class WrongAgeException extends Exception
{    
	public String toString()
	{
        	return ("Age cannot be negative!");
    	}
}

class GreaterSonAgeException extends Exception
{    
	public String toString()
	{
        	return ("Son's age cannot be more than Father's age!");
    	}
}


class Father
{
	int fage;
	Father(int x) throws WrongAgeException
	{
		fage=x;
		if(fage<0)
		throw new WrongAgeException();	
	}
}

class Son extends Father
{
	int sage;
	Son(int a, int b) throws WrongAgeException, GreaterSonAgeException
	{
		super(a);
		sage=b;
		if(sage<0)
		throw new WrongAgeException();
		else if(sage>=fage)
		throw new GreaterSonAgeException();	
	}
}

class ExceptionProg
{
	public static void main(String args[])
	{	
		try
		{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Father's Age");
			int father_age=sc.nextInt();
			System.out.println("Enter Son's Age");
			int son_age=sc.nextInt();
			Son s1=new Son(father_age,son_age);
			System.out.println("Ages are correct");
			System.out.println("Father Age="+father_age+"\nSon Age="+son_age);
		}
		catch(GreaterSonAgeException ga)
		{
			System.out.println(ga);
		}
		
		catch(WrongAgeException wa)
		{
			System.out.println(wa);
		}

		catch(Exception e)
		{
			System.out.println("Please Enter correct values!");
		}
	}
}
