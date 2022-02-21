import java.util.*;
class Main {

    public String concatAdd(String str1, String str2) {

     String str3 = str1.concat(str2);
     String str4 = str3.replaceAll("\\s", "");
     System.out.println("The string is" + str4);
     return str3;
  } 

   public static String reverse(String s) {     
     return new StringBuffer(s).reverse().toString();
   } 

   protected static int paddlingIndex(String str5,String str6)
	{
		for(int i=0;i<str5.length();i++)
		{
		   if(str6.charAt(0)==str5.charAt(i))
		   return i;
		}	
		return 0;		
	} 
   public static boolean isDigit(String str7)
	{
		int len=str7.length();
		 
		for(int i=0;i<len;i++)
		{
			char ch=str7.charAt(i);
			if(ch>='0' && ch<='9')
				continue;
			else
				return false;	
		}
		return true; 	
	}

 public static void main(String[] args) {

   Main str = new Main();
   str.concatAdd("Harsha hi","vardhan hello");
   String s = "Capgemini";
   s = reverse(s);
   System.out.println("reversed string is :" +s);
   System.out.println("The index of second string in first dtring is:-"+paddlingIndex("harshavardhan","harsha"));
   System.out.println("String value is digit or no:-"+isDigit("29"));
 }
}