package demo;
//prime
import java.util.Scanner;
class demo{
	public void prime()
	{
		int no=3;
	       while(no<20)
	       {
	       boolean prime=true;
	       for(int i=2;i<no;i++)
	       {
	    	   int s=no%i;
	    	   if(s==0)
	    	   {
	    		   prime=false;
	    	   }
	       }
	    	   if(prime)
	    	   {
	            System.out.println(no+" "+"is prime");
	    	   }
	    	   no=no+2;
	       }
	    	   
	}
	public void array()
	{
	}
}
public class array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String ar[]= {"imran","sri","thameem"};
      for(String p:ar)
      {
    	  System.out.println(p);
      }
	}

}
