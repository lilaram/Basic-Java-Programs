import java.util.Scanner;

/**
 * 
 */

/**
 * @author Lilaram Anjane
 *
 */
public class FibonicciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       int n1=0,n2=1;
		Scanner sc=new Scanner(System.in);
       System.out.println("enter the number to find the fibonncci series");
       int no=sc.nextInt();
       for(int i=0;i<no;i++)
       {
    	   int temp=n1+n2;
    	   System.out.println(temp+ " ");
    	   n1=n2;
    	   n2=temp;
    	   
       }
		
		

	}

}
