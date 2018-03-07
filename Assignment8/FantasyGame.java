import java.util.Scanner;

class FantasyGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name;
        int strength, health, luck;
        
        System.out.println("welcome to the quest");
        System.out.println("Enter the name of your charicter");
        name = scan.nextLine();
        
        System.out.println("Enter Strength (1-10):");
        strength = scan.nextInt();
        
        System.out.println("Enter health (1-10):");
        health = scan.nextInt();
        
        System.out.println("Enter luck (1-10):");
        luck = scan.nextInt();
        
        if (strength + health + luck > 15){
            System.out.println("You have give your character too many points!  Default values have been assigned:");
            strength = 5;
            health = 5;
            luck = 5;
        }
        System.out.format(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
    }
}