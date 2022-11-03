public class Calculator {
    public double firstDigit, secondDigit;
    public String expression;

    public Calculator(double firstDigit, double secondDigit, String expression){
        this.firstDigit = firstDigit;
        this.secondDigit = secondDigit;
        this.expression = expression;
    }
    //Method run which runs based on the expression
    public void calculate(){
        if (expression.equals("/")){
            System.out.println(divide());
        }

        if (expression.equals("*")){
            System.out.println(multiply());
        }

        if (expression.equals("-")){
            System.out.println(subtract());
        }

        if (expression.equals("^")){
            System.out.println(exponent());
        }


        if (expression.equals("+")){
            System.out.println(addition());
        }


        if (expression.equals("%")){
            System.out.println(mod());
        }
    }

    //Methods Divide, Multiply, Subtract, Exponent, Addition, Mod
    public double divide(){
        return firstDigit / secondDigit;
    }

    public double multiply(){
        return firstDigit * secondDigit;
    }

    public double subtract(){
        return firstDigit - secondDigit;
    }

    public double exponent(){
        return Math.pow(firstDigit, secondDigit);
    }

    public double addition(){
        return firstDigit + secondDigit;
    }

    public double mod(){
        return firstDigit % secondDigit;
    }





}
