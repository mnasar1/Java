import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
           Random ra = new Random();

           String o1 = "rock";
           String o2 = "paper";
           String o3 =  "scissors";

           String [] o = {o1 , o2 , o3};


           String user = sc.nextLine() .toLowerCase();
           String comp = o[ra.nextInt(3)];

           if (!user.equals(o1)&& !user.equals(o2) && !user.equals(o3)) {
               System.out.println("invalid move");

               System.out.println("computer move" + comp);


               }

           }



            }
        }

