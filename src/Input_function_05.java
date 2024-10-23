import java.util.Scanner;


public class Input_function_05 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Taking input from the user ");
        System.out.println("enter number 1");
        int a = in.nextInt();
        System.out.println("enter number 2");
        int b = in.nextInt();
        boolean b1 = in.hasNextInt();
        System.out.println(b1);
        int sum = a+b;
        System.out.println("sum of 2 numbers is " + sum);
        System.out.println(sum);








    }
}
