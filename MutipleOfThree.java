 // 입력된 수가 3의 배수인지 판별하는 프로그램
import java.util.Scanner;

public class MutipleOfThree {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
	
		System.out.print("수을 입력하세요: ");
        int number = scanner.nextInt();
        if (number % 3 ==0) {       //3으로 나눈 나머지가 0인지 검사
        	System.out.println("3의 배수입니다");
        }
        else {
        	System.out.println("3의 배수가 아닙니다");
        }
	}

}
