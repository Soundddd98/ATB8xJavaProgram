package Tasks.ex_02102024;

import java.util.Scanner;
public class ATB8xStudent {
    String name;
    public int age1;
    int yearsOfExp;
    int currentCompany;
    void FeesPaid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Have you paid ypur fees? Yes or No");
        String paid = sc.nextLine();
        if (paid.equalsIgnoreCase("yes") || paid.equalsIgnoreCase("s")) {
            System.out.println("Fees Paid");
        } else {
            System.out.println("Fees Not Paid");
        }
    }
    int getNumber() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your mobile number");
        int mobileNum = num.nextInt();
        return mobileNum;
    }
    void taskCompleted() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Have you paid completed your task? Yes or No");
        String task = sc.nextLine();
        if (task.equalsIgnoreCase("yes") || task.equalsIgnoreCase("s")) {
            System.out.println("task completed");
        } else {
            System.out.println("task Not completed");
        }
    }
}

