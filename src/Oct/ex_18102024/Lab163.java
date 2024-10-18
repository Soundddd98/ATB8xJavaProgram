package Oct.ex_18102024;

public class Lab163 {
    public static void main(String[] args) {
        // String buffer and String builer - helps to make the string mutable in nature, otherwise the string is immutable.
        String name = "Soundar";
        name = "Sound";
        StringBuffer stbr = new StringBuffer("Soundar");
        stbr.append("Rajan");
        System.out.println(stbr);
    }
}
