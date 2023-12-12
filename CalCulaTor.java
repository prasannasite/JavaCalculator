import java.util.Scanner;

public class CalCulaTor {
    public static void main(String[] args) {

        Scanner cal = new Scanner(System.in);

        while (true) {
            System.out.printf("Enter the Operator:");
//            int result = 0;

            char calc = cal.next().trim().charAt(0);

            if (calc == '+' || calc == '-' || calc == '*' || calc == '/' || calc == '%') {
                System.out.printf("Enter first Integer:");
                int num1 = cal.nextInt();

                System.out.printf("Enter second Integer:");
                int num2 = cal.nextInt();

                if (calc == '+') {
                    int result = num1 + num2;
                    System.out.println("Sum of " + num1 + " + " + num2 + " =" + result);
                }
                if (calc == '-') {
                    int result = num1 - num2;
                    System.out.println("Difference of " + num1 + " - " + num2 + " = " + result);
                }
                if (calc == '*') {
                    int result = num1 * num2;
                    System.out.println("The Product of " + num1 + " * " + num2 + " = " + result);
                }
                if (calc == '/') {
                    if (num2 != 2) {
                        int result = num1 / num2;
                        System.out.println("The Division of " + num1 + " / " + num2 + " = " + result);
                    }
                }
                if (calc == '%') {
                    int result = num1 % num2;
                    System.out.println("The Modulus of " + num1 + " % " + num2 + " = " + result);
                }

            } else if (calc == 'x' || calc == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println();
        }
    }
}
