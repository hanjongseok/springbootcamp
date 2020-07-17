import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyClass3 {

	public int r1() {
		int a = 1;
		System.out.println("r1에서 출력: " + a);
		return a;

	}

	public String r2() {
		String s = "hello";
		System.out.println("r2에서 출력: " + s);
		return s;
	}

	public int userdab() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public int[] randNum() {
		Random rand = new Random();
		int[] nums = new int[2];

		nums[0] = rand.nextInt(89) + 10;
		nums[1] = rand.nextInt(89) + 10;

		return nums;

	}

	public ArrayList<Integer> randNum2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();

		list.add(rand.nextInt(89) + 10);
		list.add(rand.nextInt(89) + 10);

		return list;

	}

	public int thehagi(int num1, int num2) {
		return num1 + num2;

	}

	public int n1() {
		Random rand = new Random();
		int num1 = rand.nextInt(89) + 10;
		int num2 = rand.nextInt(89) + 10;
		System.out.println(num1 + "+" + num2 + "=");
		return num1 + num2;

	}

	public boolean ox(int hap, int input) {
		if (hap == input) {
			return true;
//			System.out.println("ok");

		} else {
			return false;
//			System.out.println("x");
		}
	}
}
