package Oct.ex_18102024;

import java.util.Locale;

public class Lab161 {
    public static void main(String[] args) {
        String str =  "Hello World";
        // Length
        System.out.println("length " + str.length());

        // Sub String - Finding a part of a string
        System.out.println("Sub String: " + str.substring(1,5));

        //Trim
        System.out.println("Trim: "+str.trim() + "'");

        // Convert to case
        System.out.println("Uppercase: " + str.toUpperCase(Locale.ROOT));
        System.out.println("Lowercase: " + str.toLowerCase(Locale.ROOT));

        System.out.println(str.charAt(10));

        System.out.println(str.indexOf("e"));

        System.out.println(str.contains("p"));

        System.out.println(str.isEmpty());

        System.out.println(str.split(str));

        String name = "Soundar";
        String name2 = "SounDar";
        System.out.println(name.compareTo(name2)); // Lecxicogrpahically checks the difference is in d, hence gives the difference of

    }
}
