/*Develop a Java program to create an abstract class named Shape that contains 
two integers and an empty method named printArea( ). Provide three classes 
named Rectangle, Triangle and Circle such that each one of the classes 
extends the class Shape. Each one of the classes contain only the method 
printArea( ) that prints the area of the given shape.*/

import java.util.*;

abstract class Shape
{
	int a,b;
	abstract void printArea();
	
}

class Rectangle extends Shape
{
	double area;
	void printArea()
	{
		area=(double)a*b;
		System.out.println("The area of the rectangle is :"+area);
	}
}	

class Triangle extends Shape
{
	double area;
	void printArea()
	{	
		area=(double)0.5*a*b;
		System.out.println("The area of the Triangle is :"+area);
	}
}

class Circle extends Shape
{
	double area;
	void printArea()
	{	
		area=(double)3.14*a*a;
		System.out.println("The area of the Circle is :"+area);
	}
}

class Main4
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		Scanner ss= new Scanner(System.in);
		
		while(true)
		{
		System.out.println("Choose the shape whose area is to be calculated: ");
  		System.out.println("1.Rectangle\n2.Triangle\n3.Circle\n4.Exit ");
  		int op= ss.nextInt();
		switch(op)
		{
			case 1:System.out.println("Enter length and breadth of rectangle ");
				r.a = ss.nextInt();
				r.b = ss.nextInt();
				r.printArea();
				break;
			case 2:System.out.println("Enter base and height of triangle ");
				t.a = ss.nextInt();
				t.b = ss.nextInt();
				t.printArea();
				break;
			case 3:System.out.println("Enter radius of circle ");
				c.a = ss.nextInt();
				c.printArea();
				break;
			case 4: System.exit(0);
			default: System.out.println("Wrong choice !!");
		}
		}
	}
}

