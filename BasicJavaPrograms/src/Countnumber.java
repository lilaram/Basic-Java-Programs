import java.util.Scanner;

/**
 * 
 */

/**
 * @author Lilaram Anjane
 *
 */
public class Countnumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cnt=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the number:");
        int no=sc.nextInt();
        int temp=no;
        
        while(no>0)
        {
        	int rem=no%10;
            sum=sum*10+rem;
       	     no/=10;
       	     cnt++;
         }
  System.out.println("number of digits in entered number:"+cnt);

	}

}
