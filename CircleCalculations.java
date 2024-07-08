import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double pi = 3.14;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;
        
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        
       
    }
}
