class A1{
	public void meth1() {
		System.out.println("Method 1");
	}
}
class A2 extends A1{
	public void meth2() {
		System.out.println("Method 2");
	}
}
class A3 extends A2{
	public void meth3() {
		System.out.println("Methid 3");
	}
}
public class Multilevel_Inheritance {
	public static void main(String[] args) {
		A3 a = new A3();
		a.meth1();
		a.meth2();
		a.meth3();
	}

}
