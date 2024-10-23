import java.util.Scanner;

public class exercise_01_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks for sub1");
        float sub1 = sc.nextFloat();
        System.out.println("enter the marks for sub2 ");
        float sub2 = sc.nextFloat();
        System.out.println("enter the marks for sub3");
        float sub3 = sc.nextFloat();
        System.out.println("enter the number for sub4");
        float sub4 = sc.nextFloat();
        System.out.println("enter the number for sub5");
        float sub5 = sc.nextFloat();
        System.out.println("total marks");
        float sum = sub1 + sub2 + sub3 + sub4 + sub5 ;
        System.out.println(sum);
        System.out.println("percentage");
        float ave = (sum) /500 *100;
        System.out.println(ave);









    }
}
