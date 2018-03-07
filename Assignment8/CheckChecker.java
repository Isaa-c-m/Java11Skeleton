import java.util.Scanner;

class CheckChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double chekAccount, savAccount;
        
        System.out.println("Checking account balance:");
        chekAccount = scan.nextDouble();
        
        System.out.println("Savings account balance:");
        savAccount = scan.nextDouble();
        
        if (chekAccount > 1000 || savAccount > 1500){
            System.out.println("Checks are free");
        } else {
            System.out.println("The cost is $0.15 per check");
        }
    }
}