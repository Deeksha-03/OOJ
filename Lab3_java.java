/* Create a class Book which contains four members: name, author, price, 
num_pages. Include a constructor to set the values for the members.
Include methods to set and get the details of the objects. 
Include a toString( ) method that could display the complete details of the book. 
Develop a Java program to create n book objects.*/

import java.util.*;

class Book
{
	String name;
	String author;
	double price;
	int num_pages;
	
	Book()
	{
	name="x";
	author="y";
	price=0.0;
	num_pages=0;
	}

	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the book");
		name=sc.next();
		System.out.println("Enter the Author of the book");
		author=sc.next();
		System.out.println("Enter the Price of the book");
		price=sc.nextInt();
		System.out.println("Enter the Number of pages of the book");
		num_pages=sc.nextInt();	
	}

	public String toString()
	{
		String s = "Name of the book : "+name+"\nAuthor of the book : "+author+"\nThe Price of the book : "+price+"\nNumber of pages of the book : "+num_pages;
		return s;
	}
}

class Main3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Books");
		int n=sc.nextInt();
		Book b[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new Book();
			System.out.println("Enter Book "+(i+1)+" details");
			b[i].get();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Book "+(i+1)+" :");
			System.out.println(b[i]);
		}
	}
}