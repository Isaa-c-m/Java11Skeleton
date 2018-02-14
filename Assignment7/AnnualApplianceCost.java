import java.util.Scanner;
class AnnualApplianceCost {
    public static void main(String[] args){
        
        double khCost, khUsed, cost;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cost per killowatt-hour in cents");
        khCost = scan.nextDouble();
        System.out.println("Enter killowatt-hours used per year");
        khUsed = scan.nextDouble();
        
        cost = khCost * khUsed;
        
        System.out.println("the cost is " + cost);
    }
}