
public class Function {
	public void meth1() {
		System.out.println("Method 1 : ");
	}
	public void meth2(int a , int b) {
		int c = a + b;
		System.out.println("Ans : "+c);
	}
	public int meth(int a) {
		return a;
	}
	public static void main(String[] args) {
		Function obj = new Function();
		obj.meth1();
		obj.meth2(10,20);
		System.out.println(obj.meth(10));
		
	}

}
