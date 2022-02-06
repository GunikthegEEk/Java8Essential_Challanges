import java.util.Scanner;

class ComplexCal {
    public static void main(String[] args) {

        char operator;
        Double n1, n2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a  value");
        n1 = input.nextDouble();

        System.out.println("Enter another  value");
        n2 = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.print("Answer is : ");
        switch (operator) {

            case '+':
                result = n1 + n2;
                System.out.println(result);
                break;

            case '-':
                result = n1 - n2;
                System.out.println(result);
                break;

            case '*':
                result = n1 * n2;
                System.out.println(result);
                break;

            case '/':
                result = n1 / n2;
                System.out.println(result);
                break;

            default:
                System.out.println("Sorry Invalid Operator!");
                break;
        }

        input.close();
    }
}