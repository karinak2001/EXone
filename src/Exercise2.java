import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter step size");;
        int stepper=scanner.nextInt();
        int amount;
        do{
            System.out.println("Enter how many time to run");
            amount = scanner.nextInt();
        }while(amount<=0);
        for(int i = 0; i<=amount;i++){
            System.out.print(firstNumber + ",");
            firstNumber = firstNumber + stepper;


        }
    }
}