package SkyBeings;
import java.util.Scanner;

import BeingsOfTheEarth.Human;
import BeingsOfTheEarth.LivingBeings;
import BeingsOfTheEarth.Dog;
import BeingsOfTheEarth.Bird;

public class LivingBeingCreator implements Creator{

    @Override
    public LivingBeings createLivingBeings(String Being) {
        Scanner scanner = new Scanner(System.in);
        if (Being.equalsIgnoreCase("angel")) {

            System.out.println("Enter the name of the Angel: ");
            String name = scanner.nextLine();
            System.out.println("Enter the age of the Angel: ");
            int age = scanner.nextInt();
            System.out.println("Enter the number of offsprings: ");
            int offSprings = scanner.nextInt();
            System.out.println("Enter the number of battles fought: ");
            double battlesFought = scanner.nextInt();

            return new Angel(name, age, offSprings, battlesFought);
        } else if (Being.equalsIgnoreCase("human")) {

            System.out.println("Enter the name of the Human: ");
            String name = scanner.nextLine();
            System.out.println("Enter the age of the Human: ");
            int age = scanner.nextInt();
            System.out.println("Enter the number of offsprings: ");
            int offSprings = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the profession of the Human: ");
            String profession = scanner.nextLine();

            return new Human(name, age, offSprings, profession);
        }else if(Being.equalsIgnoreCase("dog")){

            System.out.println("Enter the name of the Dog: ");
            String name = scanner.nextLine();
            System.out.println("Enter the  age the Dog: ");
            int age = scanner.nextInt();
            System.out.println("Enter the number of offsprings: ");
            int offSprings = scanner.nextInt();
            System.out.println("Enter the number of bones collected: ");
            double bones = scanner.nextInt();

            return new Dog(name, age, offSprings, bones);

        }else if(Being.equalsIgnoreCase("bird")){

            System.out.println("Enter the name of the Bird: ");
            String name = scanner.nextLine();
            System.out.println("Enter the  age the Bird: ");
            int age = scanner.nextInt();
            System.out.println("Enter the number of offsprings: ");
            int offSprings = scanner.nextInt();
            System.out.println("Enter the number of messages delivered: ");
            double messagesDelivered = scanner.nextInt();

            return new Bird(name, age, offSprings, messagesDelivered);

        }else {
            return null;
        }
    }
}
