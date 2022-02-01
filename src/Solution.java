import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        if (number <= 0) {
            System.out.println("0");
        }
        while (number > 0) {
            sum += number;
            {System.out.println(sum);
            number--;}
        }
    }
}