package October.ex_04102024;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;
    // Default Constructor
    Dog(String breed){
        System.out.println("I am DC");
    }

    //Parameterized Constructor
    Dog (String breed, String name, int age, int legs){
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.legs = legs;
    }
    void walk(){

    }

}
