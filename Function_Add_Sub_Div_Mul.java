import java.util.Scanner;

public class Function_Add_Sub_Div_Mul {
	public void Add(int a , int b) {
		int c = a + b;
		System.out.println("Answer : "+c);
	}
	public void Sub(int a , int b) {
		int c = a - b;
		System.out.println("Answer : "+c);
	}
	public void Mult(int a , int b) {
		int c = a * b;
		System.out.println("Answer : "+c);
	}
	public void Div(int a , int b) {
		int c = a / b;
		System.out.println("Answer : "+c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1,val2;
		String choice;
		Function_Add_Sub_Div_Mul obj = new Function_Add_Sub_Div_Mul();
		System.out.println("Value 1 :");
		val1 = sc.nextInt();
		System.out.println("Value 2 :");
		val2 = sc.nextInt();
		System.out.println("Choice : ");
		choice = sc.next();
		if(choice.equals("Add")) {
			obj.Add(val1,val2);
		}else if(choice.equals("Sub")) {
			obj.Sub(val1, val2);
		}else if(choice.equals("Mult")) {
			obj.Mult(val1, val2);;
		}else if(choice.equals("Div")) {
			obj.Div(val1, val2);;
		}

	}

}
