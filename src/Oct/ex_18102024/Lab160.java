package Oct.ex_18102024;

public class Lab160 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        String s2 = new String("Hello");
        String s3 = new String ("Hello");
        System.out.println(s1 == s2); // False - Because JVM checks for location in case of String. As s1 is stored in String constant and s2 is stored Heap area
        System.out.println(s2 == s3); // False - Because in heap area, it will be created again, so 2 hello are available and it is false
        System.out.println(s1 == s4); // True - Because in String, it checks and if available, s4 is not created.
        System.out.println(s1.equals(s3)); // Equaals function checks the value in this case, HHello.
    }



}
