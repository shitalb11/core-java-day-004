package NumberPrograms;
import java.util.Scanner;
public class Demo5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            int square = num * num;
            int sum = 0;

            while (square > 0) {
                int digit = square % 10;
                sum += digit;
                square = square / 10;
            }

            if (sum == num)
                System.out.println("Neon Number");
            else
                System.out.println("Not a Neon Number");
        }
    }
