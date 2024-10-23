import java.util.Scanner;

public class elseif_18 {
    public static void main(String[] args) {


//   we use switch case as an alternative of if else and else if for conditional statement code. First it will run the
//   then it will execuete the case or it will move to next case and check and so on.... we use break condition to break the switch case. .

        Scanner a1 = new Scanner(System.in);


        String ch = a1.next();


        switch (ch) {
            case "hi":
                System.out.println("you are an Adult now!");
                break;
            case "Shoaib":
                System.out.println("you can get married");
                break;
            case "software":
                System.out.println("you can have a baby now!");
                break;
            default:
                System.out.println("You are Awesome");

//       This is an else if lader insted of using more if else condition we can use the ladder where java will check value and evaluete the code.
//        the lader is ending at else.
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();


                if (a < 60) {
                    System.out.println("you can Retire now");
                } else if (a > 50) {
                    System.out.println("you got 10 more years ");
                } else if (a > 40) {
                    System.out.println("you are an old man");
                } else {
                    System.out.println("how are you doing");
                }
                if (a > 9) {
                    System.out.println("you are a kid");
                }


        }


    }
}
