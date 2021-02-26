import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the calculator");
        System.out.println("Enter a command:");
        String type = sc.nextLine();
        
        if (type.equals("add")) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int result = calculator.add(first, second);
            System.out.println(result);
        }

        type = sc.next();
        if (type.equals("subtract")) {
            int subtract_first = sc.nextInt();
            int subtract_second = sc.nextInt();
            int subtract_result = calculator.subtract(subtract_first,subtract_second);
            System.out.println(subtract_result);
        }
        type = sc.next();
        if (type.equals("multiply")) {
            int multi_first = sc.nextInt();
            int multi_second = sc.nextInt();
            int multi_result = calculator.multiply(multi_first, multi_second);
            System.out.println(multi_result);
        }
        type = sc.next();

        if (type.equals("divide")) {
            int divide_first = sc.nextInt();
            int divide_second = sc.nextInt();
            int divide_result = calculator.divide(divide_first, divide_second);
            System.out.println(divide_result);
        }
        type = sc.next();
            
        if (type.equals("fibonacci")) {
            int fibo_first = sc.nextInt();
            int fibo_result = calculator.fibonacciNumberFinder(fibo_first);
            System.out.println(fibo_result);
        }
        type = sc.next();
            
        if (type.equals("binary")) {
            int bi_first = sc.nextInt();
            String bi_result = calculator.intToBinaryNumber(bi_first);
            System.out.println(bi_result);
            
        }


    }
}