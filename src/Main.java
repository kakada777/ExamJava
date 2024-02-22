import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = cin.nextInt();

        int[] numbers = new int[n];

        System.out.print("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = cin.nextInt();
        }

        System.out.print("Entered numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}