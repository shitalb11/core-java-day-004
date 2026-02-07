package NumberPrograms;

import java.util.Scanner;

 public class SpyNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            int sum = 0, product = 1;

            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                product *= digit;
                num = num / 10;
            }

            if (sum == product)
                System.out.println("Spy Number");
            else
                System.out.println("Not a Spy Number");
        }
    }
