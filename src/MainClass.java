
public class MainClass {

	public static void main(String[] args) {
		// 클래스 선언
		MyClass mc = new MyClass();
		System.out.println(mc);
		mc.bab();
		mc.food();
		mc.nono();
		System.out.println("===============================");

		MyClass2 mc2 = new MyClass2();
		mc2.m1();
		mc2.m2();

		System.out.println("===============================");

		MyClass3 mc3 = new MyClass3();
		mc3.r1();
		mc3.r2();

		int i = mc3.r1();
		System.out.println("r1에서 받은 int 데이터 " + i);
		String s = mc3.r2();
		System.out.println("r2에서 받은 string 데이터: " + s);
		System.out.println("===============================");

	}

}
