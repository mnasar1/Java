import javax.swing.*;
import java.util.Scanner;

public class Java_Conditionals {
    public static void main(String[] args) {



            int a = 74;

            int b = 45;

            if (a > b) {
                System.out.println("The value of a is " + a);
            } else {
                System.out.println("the vale of b is " + b);

                Scanner sc = new Scanner(System.in);
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();



                if (num1 > num2) {
                    System.out.println("max num is num1" + num1);
                } else
                    System.out.println("max num is num2" + num2);

                int age = 19;
                if (age > 18) {
                    System.out.println("Yes you can drive beta.");
                } else {
                    System.out.println("you cannot drive.");
            }

        }
    }
}



