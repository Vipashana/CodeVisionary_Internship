import java.util.Scanner;
class Calculator{
    //Method for Addition
    public static int add(int x, int y){
        return x+y;
    }
    //Method for Subtraction
    public static int sub(int x,int y){
        return x-y;
    }
    //Method for Division
    public static double div(int x, int y){
        return (double)x/y;
    }
    //Method for Multiplication
    public static int mul(int x,int y){
        return x*y;
    }

    public static void main (String[] a){
        Scanner sc = new Scanner(System.in);
        char choice;
        do{
            //Taking user inputs for numbers
            System.out.println("Enter 1st number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter 2nd number: ");
            int num2 = sc.nextInt();

            //Taking user input for operator
            System.out.println("Enter operator: ");
            String operator = sc.next();

            //Operations based on user's operator
            switch(operator) {
                case "+" -> System.out.println("Addition of " + num1 + " and " + num2 + " is " + add(num1, num2));

                case "-" -> System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub(num1, num2));

                case "/" -> System.out.println("Division of " + num1 + " and " + num2 + " is " + div(num1, num2));

                case "*" -> System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + mul(num1, num2));

                default -> System.out.println("Invalid operator");
            }

            // Ask user if they want to perform another calculation
            System.out.println("Do you want to perform another operation? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Closing the scanner
        sc.close();

        System.out.println("Calculator exited.");

        }
    }
