package Practice;

import java.util.Scanner;

public class UsrInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Have ypu paid your fees? Yes or No");
        String fees = sc.nextLine();
        //System.out.println("Your name is " + fees );
        if (fees.equalsIgnoreCase("Yes") || fees.equalsIgnoreCase("s") ){
            System.out.println("Fees is paid");
        } else {
            System.out.println("Fees is not paid");
        }
    }
}
