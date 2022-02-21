
class CS {

   int n2;
   int cube;
   int cubesu=0; 
  void cusu(int number) {
    while(number!=0)
     {

        n2 = number%10;

        cube = n2*n2*n2;

        cubesu = cubesu + cube;

        number = number/10; 

      }

    System.out.println("cube sum is "+ cubesu);
  }
}
      
 
  
class CubeSum {

  public static void main(String[] args) {

      CS c = new CS();
      c.cusu(123456789);
  }
}