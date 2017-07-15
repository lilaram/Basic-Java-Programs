import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the number:");
        int no=sc.nextInt();
        int temp=no;
        
        while(no>0)
        {
        	 int rem=no%10;
             sum=sum*10+rem;
        	 no/=10;
         }

        System.out.println("user enter no:"+temp);
        System.out.println("reverse no :"+sum);
				
	}

}
