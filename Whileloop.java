import java.util.Scanner;

public class Whileloop {
	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("N : ");
		n = sc.nextInt();
		while(n>0) {
			sum = sum+n;
			n-=1;// n = n-1
			System.out.println("Sum : "+sum);
			
		}
	}

}
