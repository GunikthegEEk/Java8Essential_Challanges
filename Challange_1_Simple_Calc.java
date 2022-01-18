import java.util.Scanner;

public class Challange_1_Simple_Calc{
    public static void main(String[] args) {
        //creating scanner object to read numerical values
        Scanner scn = new Scanner(System.in);
        //reading the first value
        System.out.print("Enter the first number: ");
        String num1 = scn.nextLine();
        //reading the first value
        System.out.print("Enter the second number: ");
        String num2 = scn.nextLine();
        //converting string values to double
        Double num1Double = Double.parseDouble(num1);
        Double num2Double = Double.parseDouble(num2);
        //print the calculations
        System.out.println("Num1 = " + num1Double + "and  Num2 = " + num2Double);
        System.out.println("Addition is: " + (num1Double+num2Double));
        System.out.println("Addition is: " + (num1Double+num2Double));
        System.out.println("Subtraction is: " + (num1Double-num2Double));
        System.out.println("Multiplication is: " + (num1Double*num2Double));
        System.out.println("Division is: " + (num1Double/num2Double));

        //closing the scanner
        scn.close();
    }
}
