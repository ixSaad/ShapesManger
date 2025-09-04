package GUI;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;
import Shapes.Triangle;

import java.util.Scanner;

public class Gui_class {
    public static int choice;
    public static Scanner input = new Scanner(System.in);  // Scanner object

    public void ReturnMenu(){
        System.out.println("1. To Back MainMenu");
        System.out.println("2. To Exit");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                menu();
                break;
                case 2:
                    System.out.println("Exitng...");
                    return;
        }
    }

    public void menu(){

        System.out.println("Welcome to Shapes Manager");
        System.out.println("Please enter your choice");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println("5. Exit");

        int choice = input.nextInt();
        switch(choice){
            case 1:
                RectangleMenu();
                //System.out.println("Rectangle Test ");
                break;


            case 2:
                SquareMenu();
                //System.out.println("Square Test ");
                break;


            case 3:
                CircleMenu();
                //System.out.println("Circle Test ");
                break;


            case 4:
                TriangleMenu();
                //System.out.println("Triangle Test ");
                break;


            case 5:
                System.out.println("Exiting...");;
                return ;

        }
    }

    public void RectangleMenu() {
        //Obj import
        Rectangle rectangleOjb;
        rectangleOjb = new Rectangle();

        System.out.println("Please Choice");
        System.out.println("1. Rectangle Area");
        System.out.println("2. Rectangle Cirumferemce ");
        System.out.println("3. exit");
        int choice = input.nextInt();
        switch(choice){

            case 1:
                System.out.println("Area of Rectangle");
                System.out.println("please enter the width of the rectangle");
                int Area_width = input.nextInt();
                System.out.println("please enter the length of the rectangle");
                int Area_length = input.nextInt();
                //rectangleOjb.setWidth(Area_width); There is no need
                //rectangleOjb.setLength(Area_length); There is no need (:
                System.out.println("Area of Rectangle : " + rectangleOjb.Area(Area_width,Area_length));
                ReturnMenu(); // TO back Main Menu
                break;

                case 2:
                    System.out.println("Cirumferemce of Rectangle");
                    System.out.println("please enter the width of the rectangle");
                    int Cirum_width = input.nextInt();
                    System.out.println("please enter the length of the rectangle");
                    int Cirum_length = input.nextInt();
                    //rectangleOjb.setWidth(Cirum_width); There is no need
                    //rectangleOjb.setLength(Cirum_length); There is no need
                    System.out.println("Cirumferemce of Rectangle : " + rectangleOjb.Cirumferemce(Cirum_width,Cirum_length));
                    ReturnMenu(); // TO back Main Menu
                    break;

                    case 3:
                        System.out.println("Exiting...");;
                        return;
        }
    }

    public void SquareMenu() {

        Square squareObj;
        squareObj = new Square();
        int Side;

        System.out.println("Please Choice");
        System.out.println("1. Square Area");
        System.out.println("2. Square Cirumferemce ");
        System.out.println("3. exit");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("Area of Square");
                System.out.println("please enter the side of the square");
                 Side = input.nextInt();
                System.out.println("The Area is " +  squareObj.Area(Side));
                ReturnMenu(); // TO back Main Menu
                  break;

                case 2:
                    System.out.println("Cirumferemce of Square");
                    System.out.println("please enter the side of the square");
                    Side = input.nextInt();
                    System.out.println("The Cirumferemce is " +  squareObj.Cirumferemce(Side));
                    ReturnMenu(); // TO back Main Menu
                  break;

                case 3:
                    System.out.println("Exiting...");
                    return;
        }
    }

    public void CircleMenu() {
        Circle circleObj;
        circleObj = new Circle();

        int radius;
        int choice;

        System.out.println("Please Choice");
        System.out.println("1. Circle Area");
        System.out.println("2. Circle Cirumferemce ");
        System.out.println("3. exit");
        choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("Please enter the radius of the circle");
                radius = input.nextInt();
                System.out.println("Area Circle is " + circleObj.CircleArea(radius));
                ReturnMenu();
                break;

            case 2:
                System.out.println("Please enter the radius of the circle");
                radius = input.nextInt();
                System.out.println("Cirumferemce Circle is " + circleObj.CirclCirumferemce(radius));
                ReturnMenu();
                break;
                case 3:
                    System.out.println("Exiting...");
                    return;
        }
    }

    public void TriangleMenu() {
         Triangle TriangleObj;
        TriangleObj = new Triangle();

        int base;
        int Height;
        int sideA;
        int sideB;
        int sideC;

        System.out.println("Please Choice");
        System.out.println("1. Triangle Area");
        System.out.println("2. Triangle Cirumferemce ");
        System.out.println("3. exit");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please enter the base of the Triangle");
                base = input.nextInt();
                System.out.println("Now enter the height of the Triangle");
                Height = input.nextInt();
                System.out.println("The Triangle Area is "+ TriangleObj.TriangleArea(base,Height));
                ReturnMenu();
                break;

            case 2:
                System.out.println("Please enter the SideA of the circle");
                sideA = input.nextInt();
                System.out.println("Please enter the SideB of the circle");
                sideB = input.nextInt();
                System.out.println("Please enter the SideC of the circle");
                sideC = input.nextInt();
                System.out.println("The Cirumferemce is " + TriangleObj.Cirumferemce(sideA,sideB,sideC));
                ReturnMenu();
                break;
            case 3:
                System.out.println("Exiting...");
                return;
        }
    }

}