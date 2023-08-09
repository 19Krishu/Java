import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Ente 1st number : ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        b = sc.nextInt();
        c = a/b;
        System.out.println("Division is : "+c);
    }
}