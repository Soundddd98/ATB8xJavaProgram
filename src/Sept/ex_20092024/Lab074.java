package Sept.ex_20092024;

public class Lab074 {
    public static void main(String[] args) {
        // grade calculator
        //A = 90-100
        //B: 80-89
        //C: 70-79
        //D:60-69
        //F: 0 -59
        int grade = -12;
        if(grade >= 90 && grade <= 100){
            System.out.println("A");
        } else if (grade >= 80 && grade <=89){
            System.out.println("B");
        } else if (grade >= 70 && grade <=79){
            System.out.println("C");
        } else if (grade >= 60 && grade <= 69){
            System.out.println("D");
        } else if (grade > 100 || grade < 0) {
            System.out.println("Incorrect");
        } else {
            System.out.println("F");
        }

    }
}
