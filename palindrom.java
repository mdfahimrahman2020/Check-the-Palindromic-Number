import java.util.Scanner;
public class palindrom
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int sum,r,num,temp;
		sum = 0;
		System.out.print("\n\n\nEnter any number : ");
		num = input.nextInt();

		temp = num;
		while (temp != 0 )
		{
			r = temp % 10;
	        sum = sum * 10 + r;
	        temp = temp / 10; 
		}
		System.out.print("\n\nReverse of the numbers : "+sum);
		System.out.println("\n\nA palindromic number is a number (such as 16461) that remains the same when its digits are reversed.");
	    
	    if (num == sum)
	    {
	    	System.out.print("\nSo it is a Palindromic Number");
	    }
	    else
	    {
	    	System.out.print("\nSo it is not a Palindromic Number");
	    }

	}


}