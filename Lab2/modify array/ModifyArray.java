public class ModifyArray {

  public static int removeDuplicate(int arr[], int n) {
    if (n == 0 || n == 1) {
      return n;
    }
     int[] temp = new int[n];
     int j = 0;
     for (int i = 0; i < n - 1; i++) {
	if (arr[i] != arr[i + 1]) {
	 temp[j++] = arr[i];
	}
      }
    temp[j++] = arr[n - 1];
		
    for (int i = 0; i < j; i++) {
     arr[i] = temp[i];
     }
    return j;
 }

   public static void main(String[] args) {
     int arr[] = { 1, 10, 30, 1, 30, 15, 30, 90, 90, 90, 10 };
     int length = arr.length;
     length = removeDuplicate(arr, length);
 
     for (int i = 0; i < length; i++)
       System.out.print(arr[i] + " ");

      System.out.println();

    System.out.println("Array in Decending order: ");

    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(arr[i] + " ");
    }
  }
}