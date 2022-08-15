package java0101;
import java.util.Scanner;
public class SuccessOrFail {

	public static void main(String[] args) {
 
		 System.out.print("당신의 점수를 입력하세요 :");		 	
         Scanner scanner = new Scanner(System.in);
	     
         int score = scanner.nextInt();
         
         if(score>80) {
			System.out.println("합격입니다");
		 }
		 if(score<80) {
		    System.out.println("불합격입니다");
    }
  }
}
