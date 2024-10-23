import java.util.Scanner;

public class Chapter_4_practise_set_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Question 1
//        int a = 10;
//        if (a =11){
//            System.out.println("Im 11");
//        }else
//            System.out.println("I'm not 11");
//        the above program will not execute as we are assining the value of a in if condition if want to print this
//        we have to use "==" to run this code.
//        System.out.println("enter the marks for sub1");
//        float sub1 = sc.nextFloat();
//        System.out.println("enter the marks for sub2");
//        float sub2 = sc.nextFloat();
//        System.out.println("enter the marks for sub3");
//        float sub3 = sc.nextFloat();
//        Float avg = (sub1 + sub2 + sub3) /3.0f;
//
//        if (avg >40 && sub1>33 && sub2>33 && sub3>33){
//            System.out.println("you are pass" );
//
//        }else
//            System.out.println("fail");
//        System.out.println("You total percent is"   +  avg);

        float tax = sc.nextFloat();
        float income = sc.nextFloat();

        if (tax<2.5){
            tax = tax +0;
        }
        else if (tax>2.5f && tax< 5f ){
            tax = tax + 0.05f * (income -2.5f);
        }
        else if (tax >5f && tax < 10.0f){
            tax = tax + 0.05f * (income-2.5f);


        }
        if (tax>10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f * (10.0f - 5f);
            tax = tax + 0.05f * (income - 2.5f);


        }
        System.out.println(" The total tax paid by Sirisha" +tax);

    }
}
