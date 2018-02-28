import java.util.Scanner;
class OrderChecker {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
    int bolts, nuts, washers;
    double totalCost;
    
    System.out.println("Number of bolts: ");
        bolts = scan.nextInt();
    System.out.println("Number of nuts: ");
        nuts = scan.nextInt();
    System.out.println("Number of washers: ");
        washers = scan.nextInt();
    
    totalCost = (bolts * boltPrice) + (nuts * nutPrice) + (washers * washerPrice);
        
    if (bolts <= nuts) {
        if (washers >= bolts *2) {
            System.out.println("Total cost: " + totalCost);
        } else {
            System.out.println("Check the Order: to few washers");
        }
    } else {
        System.out.println("Check the Order: too few nuts");
    }
}
}