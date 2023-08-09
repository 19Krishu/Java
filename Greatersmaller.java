import java.util.Scanner;

public class Greatersmaller {
	public static void main(String[] args) {
		int Val1, Val2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Value 1 :");
		System.out.println("Value 2 :");
		Val1 = sc.nextInt();
		Val2 = sc.nextInt();
		if(Val1>Val2) {
			System.out.println("Greater");
		}else{
			System.out.println("Smaller");
		}
	}

}
