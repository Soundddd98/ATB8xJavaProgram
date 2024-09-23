package Sept.ex_23092024;

public class Lab079 {
    public static void main(String[] args) {
        //real case example: in web automation, we might run the code in multiple browsers.
        // What if the user wants to run it in a specifc browser?
        String browser = "Chrome";
        switch (browser){
            case "Chrome":
                System.out.println("You are running this in Chrome");
                break;
            case "Firefox":
                System.out.println("You are running this in Firefox");
                break;
            case "Edge":
                System.out.println("You are running this in Edge");
                break;
            default:
                System.out.println("Enter the correct browser");



        }
    }
}
