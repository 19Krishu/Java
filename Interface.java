interface ifs1 {
	public void meth1();
}
interface ifs2 {
	public void meth2();
}
class Inter implements ifs1,ifs2 {

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2");
	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");
	}
}
public class Interface {
	public static void main(String[] args) {
		Inter i = new Inter();
		i.meth1();
		i.meth2();
	}
}
