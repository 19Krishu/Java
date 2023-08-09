class K {
	public void meth1() {
		System.out.println("0 Args");
	}
	public void meth2(int a) {
		System.out.println("1 Args");
	}
	public void meth3(int a , int b){
		System.out.println("2 Args");
	}
}
public class Method_Overloading {
	public static void main(String[] args) {
		K obj = new K();
		obj.meth1();
	}

}
