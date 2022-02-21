class Code
{
 public static int sumOfDigit(String str)
	{
		
		 int a=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				a=a+ Character.getNumericValue(ch);
				continue;
			}
			else
				return 0;	
		}
		return a; 	
	}
	
  public static void main(String[] args)
 {
   int res=sumOfDigit("23F");
			if(res!=0)
			System.out.println("Sum :-"+res);	
			else
			System.out.println("Wrong Digit");
	}
}