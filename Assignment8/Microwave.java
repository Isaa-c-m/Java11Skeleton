import java.util.Scanner;

class Microwave {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int item;
        double heatTime;
        
        System.out.println("How many items?");
        item = scan.nextInt();
        
        System.out.println("What is the single-item heating time?");
        heatTime = scan.nextInt();
        
        if (item == 1){
            System.out.println("Heat for: " + heatTime);
        }
        
        if (item == 2){
            System.out.println("Heat for: " + (heatTime * 1.5));
        }
        
        if (item == 3){
            System.out.println("Heat for: " + (heatTime * 2));
        }
        
        if (item > 3 || item <1){
            System.out.println("thats the wrong number of items you can only have 1 to 3");
        }
    }
}