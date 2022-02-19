package demo;
import java.util.Scanner;
 class problem{
        public void swap()
	 {
		 int a=10;
		    int b=12;
		    System.out.println("before swap");
		    System.out.println("a is :"+a);
		     System.out.println("b is :"+b);
		    a=a+b;
		    b=a-b;
		    a=a-b;
		    System.out.println("after swap");
		    System.out.println("a is :"+a);
		     System.out.println("b is :"+b);
	 }
	public void fibonnaci()
	 {
		int a=0;//1
		int b=1;//0
		int c=0;//1
		 for(int d=1;d<=8;d++)
		  {
			System.out.println(a);//0
			a=b+c;
			b=c;
			c=a;
		  }
	}
	public void factorial()
	{
		int a;
		int b=1;
		for(a=1;a<=5;a++)//5!=5*4*3*2*1
		{
	     b=b*a;
		}
		System.out.println(b);
	}
	public void prime()
	{
		int no=20;
		 for(int a=1;a<=no;a++)
		 {
			if(a%2==0)
			{
	          System.out.println("no"+ " "+a+" is not prime");
			}
			else
	System.out.println(a+" "+"is prime");
		}
		
	}
	public void palindrom()
	{ 
		int no=121;
		int d=no;
		int r=0;
		while(no>0)
		{
		r=(r*10)+no%10;//4
		no=no/10;
		
		}
		if(d==r)
	System.out.println(d+ "  is palindrom");
		else
			System.out.println(d+" is not panlidrom");
		
	}
  }
 class encapulation
 {
	 private int salary;
	 public void get()
	 {
		 System.out.print(salary);
	 }
	 public void set(int s)
	 {
		 this.salary=s;
	 }
 }
 enum day{
     MONDAY,
	 TUESDAY,
	 WEDNESDAY,
	 THURSDAY,
	 FRIDAY;
 }
 interface animal
 {
	 public  void tiger();
 }
 class a implements animal{
	 public void tiger()
	  {
		  System.out.println("tiger");
	  }
 }
 class pr{
	 protected int age=20;
 }
 class vowl
 {
	public void check()
	{
		
	}
 }
public class helloworld {
  public static void main(String args[])
  {
	problem obj=new problem();
	/* System.out.println("hello imran");
	 obj.palindrom();
	 Scanner in=new Scanner(System.in);
	 System.out.println("choose the correct answer ");
	  System.out.println("which is global language:");
	  System.out.println("(a)english (b)german (c)spansih");
	  String input=in.nextLine();
	  
	 switch(input)
	   {
	   case "a":
		   System.out.println("correct");
		   break;
	   case "b":
		   System.out.println("wrong");
		   break;
	   case "c":
		   System.out.println("wrong");
		   break;
		   default:System.out.println("correct answer is a");
	   }
	 encapulation en=new encapulation();
	 en.set(100000);
	 en.get();
	 day d=day.MONDAY;
	 System.out.println("\n"+d);
	 animal a=new a();
	 a.tiger();
	 helloworld h=new helloworld();
	 pr p=new pr();
	 int b=p.age;
	System.out.println(b);
	Scanner s=new Scanner(System.in);
	  String find=s.nextLine();
	  String ch=find;
if(ch=="a"||ch=="e"||ch=="i"||ch=="o"||ch=="u")
	  {
		 System.out.println(find+"\t"+"its vowl");
	  }
	  else
	  {
		  System.out.println(find+" "+"no its not vowl");
	  }*/
	obj.swap();
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter your alphabte");
	  String ch=s.nextLine();
  switch(ch)
  {
  case "a":System.out.println(ch+" "+"vowl");
  break;
  case "e":System.out.println(ch+" "+"vowl");
  break;
  case "i":System.out.println(ch+" "+"vowl");
  break;
  case "o":System.out.println(ch+" "+"vowl");
  break;
  case "u":System.out.println(ch+" "+"vowl");
  break;
  default:System.out.println(ch+" "+"not vowl");
  }
	  //hello
	  
  }
}
