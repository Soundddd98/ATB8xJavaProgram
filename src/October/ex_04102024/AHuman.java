package October.ex_04102024;

public class AHuman {
    String eyes_color;
    String name;

    // Default Constructor
    AHuman(){
        System.out.println("I will be called, Object is created");
    }
    // Parameterized Constructors
    AHuman(String name){
        System.out.println("hello world");
        this.name = name;
    }
    void walk(){} // No return type no arguments
    int talk (){
        System.out.println("Return Typee with Argument");
        return 10;
    }
    String sleep (String nam){
        System.out.println("Return type with Arguments");
        return "Sleeping";
    }
}
