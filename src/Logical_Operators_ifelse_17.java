public class Logical_Operators_ifelse_17 {
    public static void main(String[] args) {
        boolean a = false;

        boolean b = true;

        boolean c = true;

        if (a && b && c){
            System.out.println("yes");
        }else
            System.out.println("no");
        if (a || b ){
            System.out.println("yes");
        }else
            System.out.println("No");

        System.out.println(" logical not");
        System.out.print("Not (A) is");
        System.out.println(!a);
        System.out.print ("Not (B) is ");
        System.out.println(!b);



    }
}
