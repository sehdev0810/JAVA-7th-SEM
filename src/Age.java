import java.util.*;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 0 && age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <= 30) {
            System.out.println("Adult");
        } else if (age > 30) {
            System.out.println("Old");
        } else {
            System.out.println("Invalid age");
        }
    }
}