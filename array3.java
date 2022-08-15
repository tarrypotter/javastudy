import java.util.Arrays ;
public class array3 {
  public static void main(String[] args) {
        
        int[]a = new int[] {3,4,5};
      System.out.print(a[0] + " ");
      System.out.print(a[1] + " ");
      System.out.println(a[2] + " ");

      boolean[] b = new boolean[3];
      for (int i=0; i<3; i++){
          System.out.print(b[i] + " ");
      }
        System.out.println();
      int[] c = {3,4,5};
      int[] d = c;
       d[0] = 6;

     int[]e = new int [] {6,7,8};
      System.out.print(e[0] + " ");
      System.out.print(e[1] + " ");
      System.out.println(e[2] + " ");



      System.out.print(c[0] + " ");
      System.out.print(d[0]);
      System.out.println();
   }
  }