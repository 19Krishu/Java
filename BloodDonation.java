import java.util.Scanner;

public class BloodDonation {
	public static void main(String[] args) {
		int age;
		int weight;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mention Your Age : ");
		age = sc.nextInt();
		if(age>=18) {
			System.out.println("Mention Your Weight : ");
		weight = sc.nextInt();
		if(weight>50) {
			System.out.println("You Are Capable For Blood Donation.");
		}else {
			System.out.println("Sorry !! You Are Under Weight.");
		}
	}else {
		System.out.println("Sorry !! You Are Under Age.");
		}
	}
}
