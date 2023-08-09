import java.util.Scanner;

public class Q1_Exam_Pizza {
	public static void main(String[] args) {
	 int qty;
	 String choice,size;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Do you like to eat pizza ?");
	 choice = sc.next();
	 if(choice.equals("Yes")) {
		 System.out.println("Pizza Size : ");
		 size = sc.next();
		 if(size.equals("Small")) {
			 System.out.println("Qty : ");
			 qty = sc.nextInt();
			 if(qty==4) {
				 System.out.println("500 ml Pepsi Free....Congratulations");
			 }else {
				 System.out.println("Thank You...Enjoy Your Meal");
			 }
		 } if(size.equals("Medium")) {
				 System.out.println("Qty : ");
				 qty = sc.nextInt();
				 if(qty==3) {
					 System.out.println("1 Liter Pepsi Free....Congratulations");
				 }else {
					 System.out.println("Thank You...Enjoy Your Meal");
				 }
			 }if (size.equals("Large")) {
				 System.out.println("Qty : ");
				 qty = sc.nextInt();
				 if(qty==2) {
					 System.out.println("1 ice-cream with brownie Free....Congratulations");
				 }else {
					 System.out.println("Thank You...Enjoy Your Meal");
				 }
			 }if (size.equals("Monster")) {
				 System.out.println("Qty : ");
				 qty = sc.nextInt();
				 if(qty==1) {
					 System.out.println("1 Small Pizza with 500 ml Pepsi Free....Congratulations");
				 }else {
					 System.out.println("Thank You...Enjoy Your Meal");
				 }
		 }
	 }else {
		 System.out.println("Better Luck Next Time.");
	 }
	}
}


