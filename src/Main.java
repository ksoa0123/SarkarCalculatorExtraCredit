import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Main method

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your expression: ");

        String userExpression = scan.nextLine();

        //Find first, second, operation in the expression in format. Ex: 100 * 923

        String firstDigitString  = userExpression.substring(0, userExpression.indexOf(" ")); //First digit
        String secondDigitString = userExpression.substring(userExpression.indexOf(" ") + 3); //Second Digit
        String expression = userExpression.substring(userExpression.indexOf(" ") + 1, userExpression.indexOf(" ") + 2 );

        double firstDigit = Double.parseDouble(firstDigitString);
        double secondDigit = Double.parseDouble(secondDigitString);


        Calculator exp1 = new Calculator(firstDigit, secondDigit, expression);

        exp1.calculate();

    }
}
