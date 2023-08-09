class DO1{
	public void meth1() {
		System.out.println("Krishu");
	}
}
class BO1 extends DO1 {
	public void meth2() {
		System.out.println("Krishu Patel");
	}
}
class CO1 extends BO1 {
	public void meth3() {
		System.out.println("Krishu P Patel");
	}
}
public class Herachical_Inheritance {
	public static void main(String[] args) {
	DO1 a = new DO1();
		a.meth1();
	}

}
