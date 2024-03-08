import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Subject Marks: ");
        int a = input.nextInt();
        System.out.print("Enter Second Subject Marks: ");
        int b = input.nextInt();
        System.out.print("Enter Third Subject Marks: ");
        int c = input.nextInt();
        System.out.print("Enter Forth Subject Marks: ");
        int d = input.nextInt();
        System.out.print("Enter Fifth Subject Marks: ");
        int e = input.nextInt();
        double f = (a + b + c + d + e) / 5;
        System.out.println("Your 5 Subjects Marks Average is: " + f);
        double g = ((a + b + c + d + e) / (double) 500) * 100;
        System.out.println("Your 5 Subjects Marks Percentage is: " + g + "%");

        if (g >= 80) {
            System.out.print("Passed, Grade is A.");
        } else if (g >= 70) {
            System.out.println("Passed, Grade is B.");
        } else if (g >= 60) {
            System.out.println("Passed, Grade is C.");
        } else if (g >= 50) {
            System.out.println("Passed, Grade is D.");
        } else if (g > 42) {
            System.out.println("Passed, Grade is E.");
        } else if (g <= 42) {
            System.out.println("Failed, Grade is F.");
        }
        System.out.println("Thank You!");

    }

}
