abstract class RBI {
	abstract public void Interest();
	public void meth1() {
		System.out.println("Default Method");
	}
}
class SBI extends RBI {

	@Override
	public void Interest() {
		// TODO Auto-generated method stub
		System.out.println("SBI 5% Interest");
	}
}
class HDFC extends RBI {

	@Override
	public void Interest() {
		// TODO Auto-generated method stub
		System.out.println("HDFC 7% Interest");
	}
}
public class Abstract {
	public static void main(String[] args) {
		SBI s = new SBI();
		HDFC h = new HDFC();
		
		s.Interest();
		s.meth1();
		
		h.Interest();
		h.meth1();
	}
}


