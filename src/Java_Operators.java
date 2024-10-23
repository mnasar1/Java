import java.util.Scanner;

public class Java_Operators {
    public static void main(String[] args) {

//     Arithemetic Operator

        int a = 2;
        int b = 4;
        System.out.println(a+b);

//        Assignment Operator.: assigning the new value to variable.

        int c = 8 +a;
        int d = 21*a;
        d *=5;
        System.out.println(d);
//
//        Comaprison Operators : Comparing 2 value
//
        boolean a1 = 55>5;
        System.out.println(a1);

        System.out.println(5<3);

//        Logical Operator.

//        Logical operator. :- In logical operator we will give 2 statement by using && sign both of them should be true then it will print ture if one is true and another is false it will give output as false.
//        However in or statement || if one of the value is true and another is faslse it will print true.
//          "> greater then sign ,,, < less then sign"


        System.out.println(65>61 && 68>18);
        System.out.println(100>99 && 99<69);

        System.out.println(78>77 && 66<55);

        System.out.println(100>99 || 99<69);








    }
}
