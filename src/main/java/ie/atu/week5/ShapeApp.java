package ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        // Created first instance of Rectangle
        System.out.println("Please enter the length of the rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        Rectangle shapeRect = new Rectangle();
        shapeRect.setLength(length);
        System.out.println("you entered : " + shapeRect.getLength());



        System.out.println("Please enter the width of the rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("you entered : " + shapeRect.getWidth());

        // Created second instance of Rectangle
        Rectangle shapeRect2 = new Rectangle();
        System.out.println("Please enter the second length of the rectangle");
        double length2 = input.nextDouble();
        shapeRect2.setLength(length2);
        System.out.println("you entered : " + shapeRect2.getLength());



        System.out.println("Please enter the second width of the rectangle");
        double width2 = input.nextDouble();
        shapeRect2.setWidth(width2);
        System.out.println("you entered : " + shapeRect2.getWidth());

        Rectangle shapeRect3 = new Rectangle(23,67);
        System.out.println("you entered for length : " + shapeRect3.getLength());
        System.out.println("you entered for width : " + shapeRect3.getWidth());
    }
}
