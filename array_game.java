
import java.util.*;
public class array_game {
	 public static void main(String arg[])
	    {
	      System.out.println("enter the size of the array");
	      Scanner s=new Scanner(System.in);
	      Random r=new Random();

	      int x=s.nextInt();
	      int y[]=new int[x];
	      
	      for (int i=0;i<y.length;i++)
	        {
	    	  
	         System.out.println("enter " +i+" value");
	         y[i]=s.nextInt();
	         
	         }
	      for (int i=0;i<y.length;i++)
	      {
	    	  System.out.println(y[r.nextInt(y.length)]);
	      }
	      
	    }

}
