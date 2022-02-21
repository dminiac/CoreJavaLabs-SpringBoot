import java.util.Scanner;

public class Pipe
{
       String s;
       public String getImage(String str)
       {
              StringBuffer sbr = new StringBuffer(str);
              sbr.append('|');
              StringBuffer sb = new StringBuffer(str);
              sb.reverse();
              sbr.append(sb);
              s = sbr.toString();
              return s;
       }
       public static void main(String[] ar)
       {
              Pipe p = new Pipe();
              Scanner s = new Scanner(System.in);
              System.out.println("Enter a String");
              String str = s.next();
              System.out.println(p.getImage(str));
       }
}