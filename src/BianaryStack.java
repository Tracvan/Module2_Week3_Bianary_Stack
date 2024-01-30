import java.util.Scanner;

public class BianaryStack {
    int size;
    int index = 0;
    int[] arr;

    BianaryStack(int size) {
        this.size = size;
        arr = new int[size];

    }

    public void push(int num) {
        arr[index] = num;
        index++;
    }

    public void pop() {
        System.out.print(arr[--index]);
        size--;
    }

    public void findBinary(int number) {
        int quotient = number;

        while (quotient > 0) {
            int remainder = quotient % 2;
            this.push(remainder);
            quotient = quotient / 2;

        }
        System.out.print("Binary representation: ");
        while (index > 0) {
            this.pop();
        }
        System.out.println();

    }
}
