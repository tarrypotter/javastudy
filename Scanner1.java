package java0101;
import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("당신의 이름을 입력하세요 :");
        String name = scanner.next();
        System.out.println("당신의 이름은 "+name+"입니다");
        
        System.out.print("당신의 도시를 입력하세요 :");
        String city = scanner.next();  
        System.out.println("당신의 도시는 "+ city +"입니다");
        
        System.out.print("당신의 나이를 입력하세요 :");
        int age = scanner.nextInt();
        System.out.println("당신의 나이는 "+ age +"입니다");

        scanner.close();
	}

}
