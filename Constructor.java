class Co1{
	public Co1() {
		System.out.println("CO1 Constructor");
	}
}
class Co2 extends Co1{
	public Co2() {
		System.out.println("CO2 Constructor");
	}
}
class Co3 extends Co2{
	public Co3() {
		System.out.println("CO3 Constructor");
	}
}
	public class Constructor {
		public static void main(String[] args) {
		Co3 c = new Co3 ();	
	}
}