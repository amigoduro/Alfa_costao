import java.util.Scanner;          /// input file

public class HeronHeight
                        {
    public static void main(String[] args)
                          
                                        {
                                          
        Scanner sc = new Scanner(System.in);

        // Input sides of triangle by user

        System.out.print("Enter side a (base): ");
                                          
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
                                          
        double b = sc.nextDouble();                // using double for output


                                          
        System.out.print("Enter side c: ");       // just an output (overall)
                                          
        double c = sc.nextDouble();                // using double for output

        // Semi-perimeter from alternate side from my mind
                                          
        double s = (a + b + c) / 2;

        // Area using Heron's formula asusual
                                          
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));        // under root s(s-a)(s-b)(s-c)  the formula of herons
        

        // Height from base a side the   <
        
        double height = (2 * area) / a;

        // Output will be unexpected 
        System.out.println("\n--- Results ---");
        System.out.println("Area of Triangle: " + area);
        System.out.println("Height from base (a): " + height);
    }
}
