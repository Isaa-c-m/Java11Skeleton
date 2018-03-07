import java.util.Scanner;

class tirePressure2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double RF, LF, RR, LR;
        
        System.out.println("What is the right front tire presure?");
        RF = scan.nextDouble();
         
         System.out.println("What is the left front tire pressure?");
        LF = scan.nextDouble();
         
         System.out.println("What is the right rear tire pressure?");
        RR = scan.nextDouble();
         
         System.out.println("What is the left rear tire pressure?");
        LR = scan.nextDouble();
        
        if ((RF == LF && RR == LR) && (RF < 45) && (RR < 45) && (RF > 35) && (RR >35)){
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is BAD");
        }
    }
}