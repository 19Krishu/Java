class MO1{
	public void meth1(int a) {
		System.out.println("MO1 Method 1");
	}
}
class MO2 extends MO1{
	public void meth1(int a) {
		System.out.println("MO2 Method 1");
		super.meth1(10);
	}
}
class MO3 extends MO2{
	public void meth1(int a) {
		System.out.println("MO3 Method 1");
		super.meth1(10);
	}
}
public class Method_Overriding {
	public static void main(String[] args) {
		MO3 obj = new MO3();
		obj.meth1(10);
	}
}
