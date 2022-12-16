/*Develop a Java program
to create a class Patient with data members pt_id, pt_name, pt_age, doc.
The program should include the following functionalities.      
Accept n patient details.    
Accept a patient id and display his/her details.
Accept the name of the doctor and display the names of all the patients treated  by him/her*/

import java.util.*;
class Patient
{
	int pt_id, pt_age; 
	String pt_name, doc;
	
	void accept()
	{
		System.out.println("Enter the Patient ID of the Patient :");
		Scanner sc= new Scanner(System.in);
		pt_id=sc.nextInt();
		System.out.println("Enter the Name of the Patient :");
		pt_name=sc.next();
		System.out.println("Enter the age of Patient  :");
		pt_age=sc.nextInt();
		System.out.println("Enter the Patient's Doctor :");
		doc=sc.next();
	}
	
	//void display()
	//{
		
		//System.out.println("Patient ID : "+pt_id+"\nName of the Patient : "+pt_name+"\nThe Age of the Patient : "+pt_age+"\nName of the Doctor : "+doc);
	//}
	
	//void displayp()
	//{
		//System.out.println("\n"+pt_name);
	//}
	void display_id(int id)
	{
		if(id==pt_id)
		{
			System.out.println("Patient ID : "+pt_id+"\nName of the Patient : "+pt_name+"\nThe Age of the Patient : "+pt_age+"\nName of the Doctor : "+doc);
		}
	}

	void display_doc(String doctor)
	{
		if(doctor.equals(doc))
		{
			System.out.println("\nName of the Patient : ");
			System.out.println(pt_name);
		}
	}
}

class Mainp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Patients");
		int n=sc.nextInt();
		Patient p[]=new Patient[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new Patient();
			System.out.println("Enter Patient "+(i+1)+" details");
			p[i].accept();
		}
		
		System.out.println("Enter the Patient ID who's details you want to display");
		int pt_id=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			p[i].display_id(pt_id);
		}
		
		System.out.println("Enter the Doctor's name who's Patients you want to display");
		String doc=sc.next();
		
		for(int i=0;i<n;i++)
		{
			p[i].display_doc(doc);
		}
		//for(int i=0;i<n;i++)
		//{
			//System.out.println("Book "+(i+1)+" :");
			//System.out.println(b[i]);
		//}
	}
}
