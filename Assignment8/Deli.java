import java.util.Scanner;

class Deli {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item;
        int YNoverNight;
        double price, total, totalDelivery;
        final double delivery = 2.0, overNight = 3.0;
        
        System.out.println("Enter the item: ");
        item = scan.nextLine();
        
        System.out.println("Enter the price: ");
        price = scan.nextDouble();
        
        System.out.println("Overnight delivery (0==no,1==yes): ");
        YNoverNight = scan.nextInt();
        
        if(price < 10) {
            if(YNoverNight == 1) {
                totalDelivery = delivery + overNight;
            } else {
                totalDelivery = delivery;
            }
        } else {
            if(YNoverNight == 1) {
                totalDelivery = overNight;
            } else {
                totalDelivery = 0;
            }
        }
        
        total = price + totalDelivery;
        
        System.out.println("Invoce:");
        System.out.println(item + " " + price);
        System.out.println("delivery " + totalDelivery);
        System.out.println("total " + total);
    } 
}