import java.sql.SQLOutput;

public class Pactise_set {
    public static void main(String[] args) {
        System.out.println("Convert a String into lower case");

//        Problem 1
        String name = "Harry Poter";

        name = name.toLowerCase();

        System.out.println(name);

//        Problem 2

        String a = "Hi how are you doing today";

        a = a.replace(" ","_");

        System.out.println(a);

//        Problme 3

        String b = "Dear Mohib , thanks a lot";

        b = b.replace("Mohib","Shoaib");

        System.out.println(b);
    }
}
