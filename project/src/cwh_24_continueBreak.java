public class cwh_24_continueBreak {
    public static void main(String[] args) {

//        for (int i = 1 ; i<20; i++){
//
//            System.out.println(i);
//            System.out.println("Java is a good language to learn");
//            if (i==3){
//                System.out.println("Loop is ended");
//                break;
//
//            }
//
//
//        }
//        System.out.println("loop ended here");

//        for (int i = 0; i < 5; i++) {
//            if (i == 2) {
//                break;
//            }
//            System.out.print(i + " ");
//        }

        int i =0;
        while (i<6){
            if (i==3){
                break;
            }

            System.out.println(i+"");
            i++;
        }
        String a1 = "Hi how are you.";
        if (a1.length()<=12){

            System.out.println("your string is short");



        }else {
            System.out.println("No it is not short.");
        }
        System.out.println(a1.length());



    }
}
