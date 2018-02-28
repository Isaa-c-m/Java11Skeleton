import java.util.Scanner;
class LastChanceGas {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int tank, gage, MPG;
    
    System.out.println("Tank capacity:");
        tank = scan.nextInt();
    System.out.println("Gage reading:");
        gage = scan.nextInt();
    System.out.println("Miles per gallon:");
        MPG = scan.nextInt();
        
    if ((tank / (100 /gage)) * MPG >= 200) {
        System.out.println("Safe to Proceed");
    } else {
        System.out.println("Get Gas!");
    }
}
}