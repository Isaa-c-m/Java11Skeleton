import java.util.Scanner;
class EchoSquare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String name, animal, feature;
        
        System.out.println("enter a name: ");
        name = scan.nextLine();
        
        System.out.println("enter an animal: ");
        animal = scan.nextLine();

        System.out.println("enter a feature: ");
        feature = scan.nextLine();
        
        System.out.format("%s has a %s like a %s%n",name,feature,animal);
    }
}