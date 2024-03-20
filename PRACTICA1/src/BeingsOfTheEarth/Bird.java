package BeingsOfTheEarth;

import SkyBeings.SkyBeing;

public class Bird extends LivingBeings implements EarthBeing{
    public double messagesDelivered;
    public Bird(String name, int age, int offSprings, double messagesDelivered) {
        super(name, age, offSprings);
        this.messagesDelivered = messagesDelivered;
    }
    public void MessagesDelivered(double messagesDelivered){
        double average = messagesDelivered/age;
        System.out.println("I have delivered an average of "+average+" messages per year    - Bird");
    }
    @Override
    public void eat() {
        System.out.println("I am eating...    - Bird");
    }

    @Override
    public String toString() {
        return "Bird{" + "Name: "+name +
                ", Age: " + age +
                ", Descendants: "+offSprings +
                ", Messages delivered: "+messagesDelivered +"}";
    }

    @Override
    public void born() {
        System.out.println("I am born...    - Bird");
    }

    @Override
    public void grow() {
        System.out.println("I am growing...    - Bird");
    }

    @Override
    public void reproduce(int offSprings) {
        System.out.println("I am reproducing...    - Bird");
    }

    @Override
    public void die() {
        System.out.println("I am dying...    - Bird");
    }


    public void fly() {
        System.out.println("I am flying...    - Bird");
    }

}
