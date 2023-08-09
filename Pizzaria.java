import java.util.Scanner;

public class Pizzaria {
	public static void main(String[] args) {
		int qty;
		String wheeler,size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do You Have 4 Wheeler ?");
		wheeler = sc.next();
		if (wheeler.equals("Yes")) { 
			System.out.println("Pizza Size : ");
			size = sc.next();
			if(size.equals("Small")) {
				System.out.println("QTY : ");
				qty = sc.nextInt();
				if(qty==4) {
					System.out.println("Congratulations...You Got 500 ml Pepsi Free.");
				} else {
					System.out.println("Thank You...Have A Nice Day!! Enjoy Your Meal.");
				}
			}if(size.equals("Medium")) {
				System.out.println("QTY : ");
				qty = sc.nextInt();
				if(qty==3) {
					System.out.println("Congratulation...You Got 1 litre Pepsi Free.");
				}else {
					System.out.println("Thank You...Have A Nice Day !! Enjoy Your Meal.");
				}
			}if(size.equals("Large")) {
				System.out.println("QTY : ");
				qty = sc.nextInt();
				if(qty==2) {
					System.out.println("Congratulation...You Got 1 Ice-cream with Brownie Free.");
				}else {
					System.out.println("Thank You...Have A Nice Day !! Enjoy Your Meal.");
				}
			}if(size.equals("Monster")) {
				System.out.println("QTY : ");
				qty = sc.nextInt();
				if(qty==1) {
					System.out.println("Congratulation...You Got 1 Small Pizza with 500 ml Pepsi Free.");
				}else {
					System.out.println("Thank You...Have A Nice Day !! Enjoy Your Meal.");
				}
			}
			}else {
				System.out.println("Oops !! Better Luck Next Time...");
		}
	}
}


