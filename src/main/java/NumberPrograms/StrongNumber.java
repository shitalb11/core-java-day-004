package NumberPrograms;

import java.util.Scanner;

class StrongNumber {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        if (sum == temp)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}

// daily practice commit
// daily github practice
// github identity fix commit
