import java.util.Scanner;
public class AngleConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angleDegrees = scanner.nextDouble();

        double angleRadians = angleDegrees * Math.PI / 180;

        System.out.println("Angle in radians: " + angleRadians);

        scanner.close();
    }
}