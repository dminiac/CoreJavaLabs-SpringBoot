import java.util.*;
class Bucket
{
	private String data;
	private int counter;
	private int value;
	
	
	
	
	public String getData() {
		return data;
	}




	public void setData(String data) {
		this.data = data;
	}




	public int getCounter() {
		return counter;
	}




	public void setCounter(int counter) {
		this.counter = counter;
	}




	public int getValue() {
		return value;
	}




	public void setValue(int value) {
		this.value = value;
	}




	public Bucket() {
		
	}




	public static void main(String [] args)
	{
		System.out.println("Enter the String to reverse");
		Scanner sc= new Scanner(System.in);
		String inpdata=sc.next();
		Testing1 t1= new Testing1();
		Bucket b1=new Bucket();
		b1.setData(t1.reverse(inpdata));
		System.out.println(b1.getData());
		System.out.println("Enter the char to see count");
	    Scanner sc1=new Scanner(System.in);
		char c=sc1.next().charAt(0);
		b1.setCounter(t1.countChars(inpdata,c));
		System.out.println(b1.getCounter());
		System.out.println("numbers in given string");
		b1.setValue(t1.transfer(inpdata, c));
		System.out.println(b1.getValue());
		
			
	}

}





 class Testing1
{
	String reverse(String data)
	{	
		char ch[]=data.toCharArray();
		String rev="";
		for(int i=data.length()-1;i>=0;i--)
		{
			rev+=ch[i];
		}
			return rev;
				
						
	}

	public int countChars(String inpdata, char c) 
	{
		int count=0;
		for(int i=0;i<=inpdata.length()-1;i++)
		{
			  char ch2=inpdata.charAt(i);
			 {
				 if(c==ch2)
				count++; 
			 }
	                 
			
		}
				return count;
	}
	
	public int transfer(String inpdata,char c)
	{
		Bucket b1= new Bucket();
		int num=0;
		for(int i=0;i<=inpdata.length()-1;i++)
		{
			
			char ch3=inpdata.charAt(i);
			if(Character.isDigit(ch3))
			{
				
				String s3="";
				s3=s3+ch3;
				int number=Integer.parseInt(s3);
				num=number;
			}
				
		}
		return num;
	}
}