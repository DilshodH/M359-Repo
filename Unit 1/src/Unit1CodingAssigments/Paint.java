package Unit1CodingAssigments;//***************************************************************
//File: Unit1CodingAssigments.Paint.java
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
public class Paint {
    public static void main(String[] args) {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        //declare integers length, width, and height;
        int length, width, height;
        //declare double totalSqFt;
        double totalSqFt;
        //declare double paintNeeded;
        double paintNeeded;
        //declare and initialize Scanner object
        Scanner input = new Scanner(System.in);
        //Prompt for and read in the length of the room
        System.out.println("What is the length of the room?");
        length = input.nextInt();
        input.nextLine();
        //Prompt for and read in the width of the room
        System.out.println("What is the width of the room?");
        width = input.nextInt();
        input.nextLine();
        //Prompt for and read in the height of the room
        System.out.println("What is the height of the room?");
        height = input.nextInt();
        input.nextLine();
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = length * width * height;
        //Compute the amount of paint needed
        double amountPaint = (totalSqFt / COVERAGE) + 1;
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Gallons of paint needed: " + amountPaint);

    }
}
