class Ex {

   int calculateSum(int n) 
   {
     int sum = 0;
     for(int i=1;i<=n;i++)
		{
			if(i%3 == 0 || i%5 == 0)
				sum = sum + i;
		}
      return sum;
    }
 }

class CalculateSum {

    public static void main(String args[]) {

     Ex e = new Ex();
     int res = e.calculateSum(15);
     System.out.println("Sum  :"+res);

 }
}