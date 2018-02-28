import java.util.Scanner;
class GroundBeefValueCalculator {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    double pacA, pacB, perA, perB, CPPA, CPPB;
    
    System.out.println("Price per pound package A:");
        pacA = scan.nextDouble();
    System.out.println("Percent lean package A:");
        perA = scan.nextInt();
    System.out.println("Price per pound package B:");
        pacB = scan.nextDouble();
    System.out.println("Percent lean package B:");
        perB = scan.nextInt();
    perA = perA / 100; 
    perB = perB / 100;
    CPPA = (pacA / perA);
    CPPB = (pacB / perB);
    
    System.out.format("Package A cost per pound of lean: %s \n", CPPA);
    System.out.format("Package B cost per pound of lean: %s \n", CPPB);
    if (CPPA < CPPB) {
        System.out.println("Package A is the best value");
    } else {
        System.out.println("Package B is the best value");
    }
    }
}