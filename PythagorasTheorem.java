import java.util.Scanner;
 
public class PythagorasTheorem    
 
  
                                {
       
    // Method to calculate hypotenuse  
                                 
                                  
    static double calculateHypotenuse(double a, double b)                        // paramaters
    
                                                    {

                                                        
        return Math.sqrt((a * a) + (b * b));
                                                      
    }

    // Method to calculate missing side
    static double calculateSide(double hypotenuse, double side)              // parameters 
                                                            {
        return Math.sqrt((hypotenuse * hypotenuse) - (side * side));   //this is an pre-define function and also for this we can use our logic too ...
    }

    // Method to check Pythagoras triplet
    static boolean isPythagorasTriplet(int a, int b, int c) 
                                  {
        return (a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a);
        
    }

    public static void main(String[] args) 
                                          {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pythagoras Theorem Program ===");        // cliopatric  
        System.out.println("1. Calculate Hypotenuse");                   // norminisation
        System.out.println("2. Calculate Missing Side");                //  redifclition
        System.out.println("3. Check Pythagoras Triplet");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice)
                       {
            case 1:
                System.out.print("Enter side a: ");                  // syclopatenic
                double a = sc.nextDouble();
                System.out.print("Enter side b: ");
                double b = sc.nextDouble();
                System.out.println("Hypotenuse = " + calculateHypotenuse(a, b));
                break;

            case 2:
                System.out.print("Enter Hypotenuse: ");
                double h = sc.nextDouble();
                System.out.print("Enter known side: ");
                double s = sc.nextDouble();
                System.out.println("Missing side = " + calculateSide(h, s));
                break;

                         
            case 3:
                System.out.print("Enter first number: ");
                int x = sc.nextInt();
                System.out.print("Enter second number: ");
                int y = sc.nextInt();
                System.out.print("Enter third number: ");
                int z = sc.nextInt();
                if (isPythagorasTriplet(x, y, z))
                    System.out.println("Yes, it forms a Pythagoras triplet.");
                else
                    System.out.println("No, it does not form a Pythagoras triplet.");
                break;

            default:
                System.out.println("Invalid choice!");
            
        }

        sc.close();
    }
}
