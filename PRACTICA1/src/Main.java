import BeingsOfTheEarth.Dog;
import java.util.Scanner;
import BeingsOfTheEarth.Bird;
import BeingsOfTheEarth.EarthBeing;
import BeingsOfTheEarth.Human;
import BeingsOfTheEarth.LivingBeings;
import SkyBeings.Angel;
import SkyBeings.LivingBeingCreator;
import SkyBeings.SkyBeing;

public class Main {
    /**/
    public static void main(String[] args) {
        boolean status;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Being Creator");
            System.out.println("We have the following types of Beings: ");
            System.out.println("1. Earth Being");
            System.out.println("2. Sky Being");
            System.out.println("We have the following Earth Beings: ");
            System.out.println("1. Dog");
            System.out.println("2. Human");
            System.out.println("3. Bird");
            System.out.println("4. Angel");
            System.out.println("Enter the Being you want to create: ");
            String Being = scanner.nextLine();
            LivingBeingCreator creator = new LivingBeingCreator();
            LivingBeings Obj1 = creator.createLivingBeings(Being);
            if (((Object) Obj1).getClass().getSimpleName().equalsIgnoreCase("Dog")) {
                String string = Obj1.toString();
                System.out.println(string);
                Obj1.born();
                Obj1.grow();
                Obj1.reproduce(Obj1.offSprings);
                ((Dog)Obj1).bonesCollected(((Dog)Obj1).bones);
                ((EarthBeing)Obj1).eat();
                Obj1.die();
            } else if (((Object) Obj1).getClass().getSimpleName().equalsIgnoreCase("Human")) {
                String string = Obj1.toString();
                System.out.println(string);
                Obj1.born();
                Obj1.grow();
                Obj1.reproduce(Obj1.offSprings);
                ((EarthBeing)Obj1).eat();
                ((Human)Obj1).profession(((Human)Obj1).profession);
                ((SkyBeing)Obj1).fly();
                ((SkyBeing)Obj1).changeDimensions();
                ((SkyBeing)Obj1).think();
                Obj1.die();
            } else if(((Object) Obj1).getClass().getSimpleName().equalsIgnoreCase("Angel")){
                String string = Obj1.toString();
                System.out.println(string);
                Obj1.born();
                Obj1.grow();
                Obj1.reproduce(Obj1.offSprings);
                ((EarthBeing)Obj1).eat();
                ((Angel)Obj1).battlesFought(((Angel)Obj1).battlesFought);
                ((SkyBeing)Obj1).fly();
                ((SkyBeing)Obj1).changeDimensions();
                ((SkyBeing)Obj1).think();
                Obj1.die();
            }else if (((Object) Obj1).getClass().getSimpleName().equalsIgnoreCase("Bird")) {
                String string = Obj1.toString();
                System.out.println(string);
                Obj1.born();
                Obj1.grow();
                Obj1.reproduce(Obj1.offSprings);
                ((EarthBeing)Obj1).eat();
                ((Bird)Obj1).MessagesDelivered(((Bird)Obj1).messagesDelivered);
                ((Bird)Obj1).fly();
                Obj1.die();
            } else {
                System.out.println("Invalid Being");
            }

            System.out.println("Do you want to create another Being? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                status = true;
            } else if (response.equalsIgnoreCase("no")) {
                status = false;
            } else {
                System.out.println("Invalid response");
                status = false;
            }
        } while (status);
        System.out.println("Being Creator Closed");
    }
}