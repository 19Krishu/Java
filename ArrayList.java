
public class ArrayList {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("Java");
		ar.add(10);
		ar.add('A');
		ar.add(10.5);
		ar.add(10);
		System.out.println(ar);
		System.out.println("Size :"+ar.size());
		
		ar.add(2,"python");
		System.out.println(ar);
		System.out.println("Size :"+ar.size());
		
		ar.remove(3);
		System.out.println(ar);
		System.out.println("Size :"+ar.size());
	}
	
	
	
	private String size() {
		// TODO Auto-generated method stub
		return null;
	}



	private void remove(int i) {
		// TODO Auto-generated method stub
		
	}



	private void add(String string) {
		// TODO Auto-generated method stub
		
	}
	
	private void add(double d) {
		// TODO Auto-generated method stub
		
	}

	private void add(int i, String string) {
		// TODO Auto-generated method stub
		
	}
	private void add(char c) {
		// TODO Auto-generated method stub
		
	}
}
