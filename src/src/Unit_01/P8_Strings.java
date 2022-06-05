package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_Strings
{

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int r ,sum=0,temp;
		int n =75457;
		
		temp=n;
		while (n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is Palindrome!!!");
		}
		else
		System.out.println("Number is not Palindrome!!!");

	}

	void reverseOfAString(String s) {
    
    for(int i=s.length()-1;i>=0;i--)
    {
       System.out.print(s.charAt(i));
    }
	}
	
	void stringEqualOrNot(String s1,String s2) {
		  int flag=0;
			System.out.println("\n");
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				flag++;	
			}
			if(flag==s1.length() && flag==s2.length())
			    System.out.println("Strings are equal");
			else
				System.out.println("Strings are not equal");
		}
		
		
	}
}