class Power {

  boolean pow(int n) {
    if (n == 0)
        return false;
    while (n != 1) {
        if (n % 2 != 0)
            return false;
        n = n / 2;
    }
    return true;
 }
}

class PowerMain {

   public static void main(String[] args) {
     Power pr = new Power();
     boolean result = pr.pow(9);
     System.out.println("Result is"+result);
  }
}
