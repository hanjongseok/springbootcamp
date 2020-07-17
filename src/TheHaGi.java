import java.util.ArrayList;
import java.util.Scanner;

//클래스를 만들고 메소드를 만들기
//더하기 게임의 기능을 별도 만들어서 
//더하기 를 출력해주는 메소드 // 더하기의 답을 전달해주는 메소드
//메인에소 메소드만 이용해서 출력 또는 답을비교
public class TheHaGi {
	public static void main(String[] args) {
		MyClass3 mc4 = new MyClass3();

//		int hap = mc4.n1();
//		int input = mc4.userdab();
//		while(!mc4.ox(hap, input)) {
//			System.out.println("x");
//			break;
//		}
//		System.out.println("ok");
//		for (;;) {
//			int hap = mc4.n1();
//
//			int input = mc4.userdab();
//			if (hap == input) {
//
//				System.out.println("ok");
//
//			} else {
//
//				System.out.println("x");
//			}
//		}
		ArrayList<Integer> list = mc4.randNum2();
		System.out.println("리스트 랜덤의 수 갯수" + list.size());
		System.out.println("첫번째 수: " + list.get(0));
		System.out.println("두번째 수: " + list.get(1));
		int dad = mc4.thehagi(list.get(0), list.get(1));// 오버로딩 문제 필수
		System.out.println(dad);
		/*
		 * *메서드 오버로딩 메소드의 이름이 같지만 매개변수로 알아 볼 수 있는것 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가
		 * 있더라도 매개 변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있는데 이를 메소드 오버로딩이라 한다.
		 */

	}

}
