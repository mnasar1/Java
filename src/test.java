import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;
        if (a>b){
            System.out.println("a is greater then b");

        }else
            System.out.println("a is greater then b");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("max num is " + num1);

        }else
            System.out.println("max num is num3" + num3);

        String a1 = "how are you ";
        String a2 = "doing great";

        if (a1.length()<a2.length()){
            System.out.println("a1 has more char");

        }else
            System.out.println("a2 has more char");
        int e = sc.nextInt();
        if (e%2==0){
            System.out.println("it is even number");

        }else
            System.out.println("odd number");

    }
}
