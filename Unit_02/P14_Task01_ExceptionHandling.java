package Unit_02; 
import java.util.*;

public class P14_Task01_ExceptionHandling {
public static void main(String[] args) {
	 int b=0;
	try {
	    int a =100/b;
	    System.out.println(a);
	}
	
	catch(ArithmeticException e) {
		System.out.println("divided by zero...");
	}
	catch (Exception e) {
		System.out.println(":::::");
	}
 }
}
  class exc2
  {
	  static void stack(int a)
	  {
		  while(a>0) {
			  stack(a++);
		  }
	  }
	 