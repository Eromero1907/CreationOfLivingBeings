package BeingsOfTheEarth;

import SkyBeings.SkyBeing;

public class Human extends LivingBeings implements EarthBeing, SkyBeing {
    public String profession;
    public Human(String name, int age, int offSprings, String profession) {
        super(name, age, offSprings);
        this.name = name;
        this.age = age;
        this.offSprings = offSprings;
        this.profession = profession;
    }
    @Override
    public String toString(){
        return "Human{" + "Name: "+name +
                ", Age: " + age +
                ", Descendants: "+offSprings +
                ", Profession: "+profession+"}";
    }
    public void profession(String profession) {

        System.out.println("I am a(n) " + profession + "  - Human");
    }
    @Override
    public void eat() {
        System.out.println("I am eating   - Human");
    }

    @Override
    public void born() {
        System.out.println("I am born   - Human");
    }

    @Override
    public void grow() {
        System.out.println("I am growing   - Human");
    }

    @Override
    public void reproduce(int offSprings) {
        System.out.println("I have "+offSprings+" descendants    - Human");
    }

    @Override
    public void die() {
        System.out.println("I am dying   - Human");
    }

    @Override
    public void fly() {
        System.out.println("I am flying   - Human");
    }

    @Override
    public void changeDimensions() {
        System.out.println("I am changing dimensions...   - Human");
    }

    @Override
    public void think() {
        System.out.println("I am thinking   - Human");
    }
}