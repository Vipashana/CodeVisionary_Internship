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
    public static int div(int x, int y){
        return x/y;
    }
    //Method for Multiplication
    public static int mul(int x,int y){
        return x*y;
    }

    public static void main (String[] a){
        //Creating scanner object to get user inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter operator: ");
        String operator = sc.next();
        //Operations based on user's operator
        switch(operator){
            case "+" -> System.out.println("Addition of "+num1+" and "+num2+ " is "+add(num1,num2));

            case "-" -> System.out.println("Subtraction of "+num1+" and "+num2+ " is "+sub(num1,num2));

            case "/" -> System.out.println("Division of "+num1+" and "+num2+ " is "+div(num1,num2));

            case "*" -> System.out.println("Multiplication of "+num1+" and "+num2+ " is "+mul(num1,num2));

            default -> System.out.println("Invalid operator");

        }
    }
}