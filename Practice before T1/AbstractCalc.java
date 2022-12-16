/*3. Create an abstract class Calculate which has three double members -say x, y and result. 
Include a method calc. 
Derive three classes from Calculate which performs any three arithmetic operations on the two variables x and y and assign the result to the variable result.
Make appropriate declarations and definitions.*/

import java.util.Scanner;
abstract class Calculate
{
	double x,y,result;
	abstract void calc();
}

class Addition extends Calculate
{
	void accept()
	{
		Scanner ss = new Scanner(System.in);
 		System.out.println("Enter the value of x and y");
 		x = ss.nextDouble();
 		y = ss.nextDouble();
	}
	void calc()
	{
 		result = x+y;
  		System.out.println(x+" + "+y+" = "+result);
 	}
}

class Subtraction extends Calculate
{
	void accept()
	{
		Scanner ss = new Scanner(System.in);
 		System.out.println("Enter the value of x and y");
 		x = ss.nextDouble();
 		y = ss.nextDouble();
	}

 	void calc()
	{
  		result = x-y;
  		System.out.println(x+" - "+y+" = "+result);
 	}
}

class Multiplication extends Calculate
{
	void accept()
	{
		Scanner ss = new Scanner(System.in);
 		System.out.println("Enter the value of x and y");
 		x = ss.nextDouble();
 		y = ss.nextDouble();
	}
 	void calc()
	{
  		result = x*y;
  		System.out.println(x+" * "+y+" = "+result);
 }
}

class AbstractCalc
{
 	public static void main(String args[])
	{
 		Addition a = new Addition ();
  		Subtraction s = new Subtraction ();
  		Multiplication m = new Multiplication ();
  		System.out.println("Addition");
		a.accept();
  		a.calc();
 		System.out.println("Subtraction");
		s.accept();
 		s.calc();
 		System.out.println("Multiplication");
		m.accept();
 		m.calc();
 }
}