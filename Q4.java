
abstract class parent
{
	abstract public void intrest();
}
class first extends parent
{

	@Override
	public void intrest() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
	}
	
}
class second extends parent
{

	@Override
	public void intrest() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
	}
	

}
public class Q4 {
	public static void main(String[] args) {
		second h=new second();
		first s=new first();
		s.intrest();
		h.intrest();
}}
