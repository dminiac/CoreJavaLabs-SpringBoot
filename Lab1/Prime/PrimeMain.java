class Prime { 

   int i, count=0, j;
   int pri(int n)
    {
      for(i=1; i<=n; i++)
     {
        for(j=2; j<i; j++)
        {
           if(i%j==0)
           {
               count++;
               break;
           }
        }
        if(count==0 && i!=1)
            System.out.println(" " +i);
        count = 0;
     }
    
    return 0;
  }
}

class PrimeMain {

     public static void main(String[] args) {

         Prime pm = new Prime();
         int res = pm.pri(10);
  }
}
