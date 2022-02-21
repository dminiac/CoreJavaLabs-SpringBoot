public class ReverseOrder {

   public static void main(String[] args) {

     int[] arr = new int[] { 21, 11, 40, 35, 93 };
     System.out.println("Print Array: ");
     for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i] + " ");
     }
   System.out.println();

   System.out.println("Array in reverse order: ");

    for (int i = arr.length - 1; i >= 0; i--) {
     System.out.println(arr[i] + " ");

   }
  }
}