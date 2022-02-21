class Fibonacci 
{
  int i;
  int a=1;
  int b=1;
  int c=0;
  int fib(int n)
   {
     if(n <= 1)
       return n;
     return fib(n-1) + fib(n-2);
    }
  int nonfib(int n1)
   {
     for(i=0; i<n1-2; i++)
      {
        c = a+b;
        a = b;
        b = c;
      }
   return c;
 }
}

class FibonacciTest {
 
   public static void main(String [] args) {

     Fibonacci fb = new Fibonacci();
     int res = fb.fib(9);
     System.out.println("Output is : " +res);
     Fibonacci fb1 = new Fibonacci();
     int res1 = fb1.nonfib(8);
     System.out.println("Output is : " +res1);
  }
}
