class StringPattern
{
	
	public static String lowerCaseString(String str)
	{
		String[] str1=str.split(" ");
		int count1=0,count2=0;
		for(int i=0;i<str1.length;i++)
		{
			if(count1==0 && str1[i].charAt(0)=='C' || str1[i].charAt(0)=='c')
			{
				String temp=str1[0];
				str1[0]=str1[i];
				str1[i]=temp;
				count1++;
			}
			else if(count1==0 && str1[i].charAt(0)=='M' || str1[i].charAt(0)=='m')
			{
				String temp=str1[2];
				str1[2]=str1[i];
				str1[i]=temp;
				count2++;
			}
			else if(count1==1&&count2==1)
				break;	
		}
		String ans="";
		for(int i=0;i<str1.length;i++)
		{
			ans=ans+str1[i]+" ";
		}

		return  ans.toLowerCase();
	}
	public static void main(String[] args)
	{
			System.out.println("output is-"+lowerCaseString("I love my Blue Car"));
			
	}
}