 public class Main
{ 
   static int small(int arr[])
   {
      int s = arr[0];

      for (int i=0; i < arr.length; i++){
         if(arr[i] < s)
            s = arr[i];
      }

     int s2 = Integer.MAX_VALUE;

     for (int i=0; i < arr.length; i++){
         if(arr[i] != s && arr[i] < s2)
           s2 = arr[i];
     }

    return s2;

  }

  public static void main(String args[])
  {

      int arr[] = {12, 13, 1, 10, 34, 10};
      System.out.println(small(arr)); 
   }
}