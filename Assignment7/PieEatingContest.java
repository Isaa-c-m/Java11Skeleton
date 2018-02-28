import java.util.Scanner;
class PieEatingContest {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    double weight;
    
    System.out.println("Enter the weight");
        weight = scan.nextDouble();
    
    if (weight >= 220) {
        if (weight <= 280) {
            System.out.println("the contestant can participate");
        } else {
            System.out.println("the contestant is too heavy");
        }
    } else {
        System.out.println("the contestant is too light");
    }
}
}