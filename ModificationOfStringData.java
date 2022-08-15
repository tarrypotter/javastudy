import java.util.Arrays;

public class ModificationOfStringData {
    
    public static void main (String []agrs){

        int[] array1 = new int[] {3,4,5};
        int[] array2 = array1;
        array1[0] = 6; array1[1] = 7 ; array1[2] = 8;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
       
    }
}