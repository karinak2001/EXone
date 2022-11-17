import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 coefficient of the quadratic equation");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int root = (num2 * num2) - (4 * num1 * num3);
        double solve;
        if (root == 0) {
            solve = -num2 / (2 * num1);
            System.out.println("there is one solution x =" + solve);
        } else if (root <0) {
            System.out.println("There is no solution");
        }
        else {
            solve=((-num2+(Math.sqrt((double) root)))/(2*num1));
            System.out.println("There are 2 solutions:");
            System.out.println("X1="+solve);
            solve=((-num2-(Math.sqrt((double) root)))/(2*num1));
            System.out.println("X2="+solve);
    }
    }

}