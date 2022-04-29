import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Mini_Calc {

    private static final Logger logger = LogManager.getLogger(Mini_Calc.class);
    public Mini_Calc() {
    }

    public static void main(String[] args) {

        Mini_Calc mini = new Mini_Calc();
        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        do {
            System.out.println("Calculator--DevOps");
            System.out.println("");
            System.out.println("BASIC");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Modulus");
            System.out.println("");
            System.out.println("SCIENTIFIC");
            System.out.println("6) Factorial");
            System.out.println("7) Square-Root");
            System.out.println("8) Power");
            System.out.println("9) Natural Logarithm");
            System.out.println("10) Exit");
            System.out.print("Enter your choice: ");
            int ch;
            try {
                ch = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (ch) {
                case 1:
                    System.out.print("ADDITION ");
                    System.out.print("Enter the first number : ");
                    n1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = scanner.nextDouble();
                    System.out.println("Addition of "+n1+" and "+n2+" is " +(n1+n2));
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.print("SUBTRACTION ");
                    System.out.print("Enter the first number : ");
                    n1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = scanner.nextDouble();
                    System.out.println("Subtraction of "+n1+" and "+n2+" is " +(n1-n2));
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.print("MULTIPLICATION ");
                    System.out.print("Enter the first number : ");
                    n1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = scanner.nextDouble();
                    System.out.println("Multiplication of "+n1+" and "+n2+" is " +(n1*n2));
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.print("DIVISION ");
                    System.out.print("Enter the first number : ");
                    n1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = scanner.nextDouble();
                    System.out.println("Division of "+n1+" and "+n2+" is " +(n1/n2));
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.print("MODULUS ");
                    System.out.print("Enter the first number : ");
                    n1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = scanner.nextDouble();
                    System.out.println("Modulus of "+n1+" and "+n2+" is " +(n1%n2));
                    System.out.println("\n");
                    break;

                case 6:
                    System.out.print("FACTORIAL ");
                    System.out.print("Enter a number : ");
                    n1 = scanner.nextDouble();
                    System.out.println("Factorial of "+n1+" is : " + mini.fact(n1));
                    System.out.println("\n");

                    break;
                case 7:
                    System.out.print("SQUARE ROOT ");
                    System.out.print("Enter a number : ");
                    n1 = scanner.nextDouble();
                    System.out.println("Square root of "+n1+" is : " + mini.sqroot(n1));
                    System.out.println("\n");


                    break;
                case 8:
                    System.out.print("POWER ");
                    System.out.print("Enter the first number : ");
                    n1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    n2 = scanner.nextDouble();
                    System.out.println(n1+ " raised to power "+n2+" is : " + mini.power(n1, n2));
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.print("NATURAL LOG ");
                    System.out.print("Enter a number : ");
                    n1 = scanner.nextDouble();
                    System.out.println("Natural log of "+n1+" is : " + mini.naturalLog(n1));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Finished..");
                    return;
            }
        } while (true);
    }


    public double fact(double n) {
        logger.info("[FACTORIAL] - " + n);
        double f = 1;
        for(int i = 1;i<=n;i++)
        {
            f = f * i;
        }
        logger.info("[RESULT - FACTORIAL] - " + f);
        return f;
    }



    public double sqroot(double n) {
        logger.info("[SQ ROOT] - " + n);
        double result = Math.sqrt(n);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }


    public double power(double n1, double n2) {
        logger.info("[POWER - " + n1 + " RAISED TO] " + n2);
        double result = Math.pow(n1,n2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double naturalLog(double n) {
        logger.info("[NATURAL LOG] - " + n);
        double result = 0;
        try {

            if (n <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(n);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

}
