import java.util.Scanner;
class NumberTester {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double distance, time, Gs;
    
    System.out.println("enter the time");
    time = scan.nextDouble();
    Gs = 32.174;
    
    distance = (.5 * Gs * (time * time));
    System.out.println("distance = " + distance);
    }
}