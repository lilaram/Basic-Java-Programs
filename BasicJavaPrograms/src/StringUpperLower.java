/**
 * 
 */

/**
 * @author Lilaram Anjane
 *
 */
public class StringUpperLower {

	public void Stringconvert(String str)
	{
		   for(int i=0;i<str.length();i++)
		   {
			     int a=str.charAt(i);
			     if(a>=97 && a<=122)
			     {
			    	  a=a-32;
			    	  System.out.print((char)a);
			     }
			     else if(a>=65 && a<=90)
			     {
			    	 a=a+32;
			    	 System.out.print((char)a);
			     }
			     else if (a==32)
			     {
			    	  
			    	 System.out.print(" ");
			     }
			     
		   }
		   
		
		
	}

	public static void main(String[] args) {
      
		  StringUpperLower s=new StringUpperLower();
		  s.Stringconvert("abHIJEET SAVkar");
        
	}

}
