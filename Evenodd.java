import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		int val;
		Scanner sc = new Scanner(System.in);
		System.out.println("Value 1 : ");
		val = sc.nextInt();
		if(val%2==0) {
			System.out.println("Even");
		}else { 
			System.out.println("Odd");
		}
	}
}
