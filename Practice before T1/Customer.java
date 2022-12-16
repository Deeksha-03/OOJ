/*Programs that can be tried out in lab today are given here. Complete all of these and upload in github as Additional programs done before T1.
1.     Create a class Customer with the following specifications.
Private Members :Customer_no , Customer_name,  Qty ,  Price, TotalPrice, Discount, Netprice.
Methods: Public members:1. A parameterized constructor to assign initial

2. Input( ) – to read data members. Call Caldiscount().

3. Caldiscount ( ) – To calculate Discount according to TotalPrice and NetPrice
TotalPrice = Price*Qty
TotalPrice >=50000 – Discount 25% of TotalPrice
TotalPrice >=25000 - Discount 10% of TotalPrice
 Netprice= TotalPrice-Discount

4.Show( ) – to display Customer details.                    
Develop a Java program to accept details of n
customers, calculate the discounts given to them and print their complete
details.*/


import java.util.Scanner;

class Customer
{
 	private int cno, qty;
 	private double price, totalprice, discount, netprice;
 	private String cname;

 	public Customer(int cNo,int Qty,double Price,double tprice,double dis,double nprice,String cName )
	{
   		cno=cNo; 
		qty=Qty;
   		price=Price; 
		totalprice=tprice; 
		discount=dis; 
		netprice=nprice;
   		cname = cName;
	}

  	public void Input()
	{
  		Scanner ss = new Scanner(System.in);
  		System.out.println("Enter the Customer name, Customer number, Quantity and the Price ");
  		cname=ss.next();
  		cno=ss.nextInt();
  		qty= ss.nextInt();
 		price=ss.nextDouble();
  		netprice= CalDiscount();
 	}
 	public double CalDiscount()
	{
		
  		totalprice=price*qty;
  		if(totalprice>=50000)
		{
   		discount=0.25*totalprice;
  		}
 		else if(totalprice>=25000)
		{
   		discount=0.10*totalprice;
  		}
  		else discount=0;
  		netprice=totalprice-discount;
  		return netprice;
 	}
 	public void Show()
	{
   		System.out.println("Customer name:"+cname);
   		System.out.println("Customer number:"+cno);  
   		System.out.println("Quantity of item:"+qty);  
   		System.out.println("Price of item:"+price);
		System.out.println("Total price:"+totalprice);
		System.out.println("Discount for the item:"+discount);
   		System.out.println("Net price:"+netprice+"\n");    
 	}
}

class Maincus
{
 	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Customers");
		int n=sc.nextInt();
		Customer c[]=new Customer [n];
		for(int i=0;i<n;i++)
		{
			c[i]=new Customer (0,0,0,0,0,0,null);
			System.out.println("Enter Customer "+(i+1)+" details");
			c[i].Input(); 
		}

		for(int i=0;i<n;i++)
		{
			System.out.println("\nCustomer "+(i+1)+" :");
			c[i].Show();
		}
  		
 }
}
