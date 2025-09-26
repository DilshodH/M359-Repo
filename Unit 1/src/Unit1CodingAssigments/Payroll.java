package Unit1CodingAssigments;

import java.util.Scanner;

public class Payroll {

    public static void main(String[] args){

        //declare and initialize Scanner object
        Scanner input = new Scanner(System.in);
        // make variables
        String name;
        int numHours;
        int hourPay;
        int fedTax;
        int stateTax;

        System.out.println("Employee’s Name");
        name = input.nextLine();

        System.out.println("Number of hours worked in week");
        numHours = input.nextInt();

        System.out.println("Hourly pay rate");
        hourPay = input.nextInt();

        System.out.println("Federal tax withholding rate");
        fedTax = input.nextInt();

        System.out.println("State tax withholding rate");
        stateTax = input.nextInt();
    }

    public static void computePay(int hours, double pay){

    }
}
