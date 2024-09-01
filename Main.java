//Import scanner to input the height and radius 
import java.util.Scanner;

//Class
class Cylinder {
    //Declare variables
    double radius;
    double height;

    //Get the input for radius and height from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        //Asking the user for the value of radius
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        //Asking the user for the value of height
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
        scanner.close(); //Close the scanner
    }

    //Compute the area of the cylinder using Area() method
    public double Area(double radius, double height) {
        //Formula for the area of cylinder
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * height);
    }
    
}

//Subclass to compute the volume of the cylinder
class CylinderVol extends Cylinder {
    //Compute the volume of the cylinder using Volume() method
    public double Volume(double radius, double height) {
        //Formula for the volume of cylinder
        return Math.PI * radius * radius * (2 * height);
    }
}

//Display 
public class Main {
    public static void main(String[] args) {
        CylinderVol myCylinder = new CylinderVol();
        
        myCylinder.getInput();
        
        double area = myCylinder.Area(myCylinder.radius, myCylinder.height);
        double volume = myCylinder.Volume(myCylinder.radius, myCylinder.height);
        
        System.out.println("The computed area of the cylinder is: " + area);
        System.out.println("The computed volume of the cylinder is: " + volume);
    }
}