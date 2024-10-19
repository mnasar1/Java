public class String_methods_14 {
    public static void main(String[] args) {
        String name = "Harry";


        int value = name.length();

        String a = "CoMMing SunDay Im going to PLaY for my TEAM in MFP GROUND SHamShabad";
        String a_1 = "CoMMing SunDay Im going to PLaY for my TEAM in MFP GROUND SHamShabad";

        String b = a.toLowerCase();
        String c = a_1.toUpperCase();
        String nonTrimmed = "   Hi      how are    you today ?     ";
        String Trimmedstring = nonTrimmed.trim();


//

//
//        System.out.println(nonTrimmed.trim());
//        System.out.println(nonTrimmed);
//        System.out.println(Trimmedstring);
//
        System.out.println(name.substring(1,5));
        System.out.println(name.substring(2));
//
//        System.out.println(name.replace('r', 'p'));
//        System.out.println(name.replace("r" , "ier"));
//        System.out.println(name.startsWith("Har"));
//        System.out.println(name.endsWith("rry"));
//        System.out.println(name.charAt(4));
        String Modifiedname = "Harryrryury";
        System.out.println(name.indexOf("r"));
        System.out.println(Modifiedname.indexOf("rry",7));
        System.out.println(Modifiedname.lastIndexOf("r",4));
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("haRRy"));



//        System.out.println(value);
//        System.out.println(b);
//        System.out.println(c);




    }
}
