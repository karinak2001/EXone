import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diamond;
        do {
            System.out.println("Enter a number");
            diamond = scanner.nextInt();
        }
        while (diamond <= 3 && diamond % 2 == 0);



    }
}
