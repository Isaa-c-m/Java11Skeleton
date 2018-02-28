import java.util.Scanner;
class DiscountPrices {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    double price, disPrice;
    
    System.out.println("enter amount");
    price = scan.nextDouble();
    
    if (price >= 10){
        price = (price * 0.9);
        System.out.println("discounted price " + price);
    } else {
        System.out.println("no discount for you");
    }
}
}