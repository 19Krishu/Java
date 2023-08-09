interface A {
	public void meth1();
}
interface B {
	public void meth2();
}
class C implements A,B  {

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Krishu Patel");
	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Patel Krishu");
	}

}
public class Multiple_Inheritance {
	public static void main(String[] args) {
		C c = new C();
		c.meth1();
		c.meth2();
	}
}
