package exercise4;

import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int[] numbers = new int[count];
        String space = "";

        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();

        }
        for (int i = 0; i < count; i++) {
            System.out.println(space + numbers[i]);
            space = space + " ";
        }
    }
}