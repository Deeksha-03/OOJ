/*Develop a Java program to create a class Student with members usn, name, 
an array credits and an array marks. Include methods to accept and display 
details and a method to calculate SGPA of a student. */

import java.util.*;

class Student
{
	String usn;
	String name;
	String sub[]=new String[20];
	int credits[]=new int[20];
	int marks[]=new int[20];
	int cie[]=new int[20];
	int see[]=new int[20];
	int n;
	
	void accept()
	{
		System.out.println("Enter the USN of the Student :");
		Scanner sc= new Scanner(System.in);
		usn=sc.next();
		System.out.println("Enter the Name of the Student :");
		name=sc.next();
		System.out.println("Enter the number of subjects :");
		n=sc.nextInt();

		System.out.println("Enter the name of each subjects in order :");
		for(int i=0;i<n;i++)
		{
			sub[i]=sc.next();
		}

		System.out.println("Enter the credits of each subjects in order :");
		for(int i=0;i<n;i++)
		{
			credits[i]=sc.nextInt();
		}

		System.out.println("Enter the CIE Marks of each subjects in order(out of 50) :");
		for(int i=0;i<n;i++)
		{
			cie[i]=sc.nextInt();
		}

		System.out.println("Enter the SEE Marks of each subjects in order(out of 100):");
		for(int i=0;i<n;i++)
		{
			see[i]=sc.nextInt();
			marks[i]=(see[i]/2)+cie[i];	
		}
	}

	double calculate()
	{
		int totalcre=0;
		int sum=0;
		double sgpa;
		for(int i=0;i<n;i++)
		{
			sum+=check(marks[i],cie[i],see[i])*credits[i];
			totalcre+=credits[i];
		}
		sgpa= (double) sum/totalcre;
		return sgpa;
	}
	
	int check(int m, int c, int s)
	{	
		if(c<20)
		{
			return 0;
		}
		else if(s<40)
		{
			return 0;
		}
		else
		{	
			if((m>=90)&&(m<=100))
				return 10;
		
			else if((m>=80)&&(m<90))
				return 9;
			
			else if((m>=70)&&(m<80))
				return 8;

			else if((m>=60)&&(m<70))
				return 7;

			else if((m>=55)&&(m<60))
				return 6;

			else if((m>=50)&&(m<55))
				return 5;

			else if((m>=40)&&(m<50))
				return 4;

			else 
				return 0;
		}
	}

	void display()
	{
		double sgpa;
		System.out.println("USN : "+usn);
		System.out.println("Name : "+name);
		System.out.println("Subject\tCredits\tMarks\tGrade Points");
		for(int i=0;i<n;i++)
		{
			System.out.println(sub[i]+"\t"+credits[i]+"\t"+marks[i]+"\t"+check(marks[i],cie[i],see[i]));
		}
		sgpa=calculate();
		System.out.println("SGPA = "+sgpa);
	}	
	
}

class Main2
{
	public static void main(String args[])
	{
		double sgpa;
		Student s1=new Student();
		s1.accept();
		s1.display();
	}
}


