package java0101;
import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
	    Random r = new Random();	//Random 클래스 객체 생성
         
	     System.out.println("0~99 범위의 난수 : " +Math.abs(r.nextInt() % 100));
	   //난수 값을 100으로 나눈 나머지를 양수로 바꿈
	}

}
