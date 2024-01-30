import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BianaryStack stack = new BianaryStack(100);
        System.out.println("Input number: ");
        int inputNumber = scanner.nextInt();
        stack.findBinary(inputNumber);
    }
}
