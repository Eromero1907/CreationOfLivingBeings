package SkyBeings;

import BeingsOfTheEarth.LivingBeings;
import BeingsOfTheEarth.EarthBeing;

public class Angel extends LivingBeings implements SkyBeing, EarthBeing{
    public double battlesFought;

    public Angel(String name, int age, int offSprings, double battlesFought){
        super(name, age, offSprings);
        this.name = name;
        this.age = age;
        this.offSprings = offSprings;
        this.battlesFought = battlesFought;
    }
    @Override
    public String toString(){
        return "Angel{" + "Name: "+name+
                ", Age: " + age +
                ", Descendants: "+offSprings+
                ", Battles Fought: "+battlesFought+"}";
    }
    public void battlesFought(double battlesFought){
        double battles = battlesFought/age;
        System.out.println("I have fought on an average of "+battles+" battles per year    - Angel");
    }
    @Override
    public void fly() {
        System.out.println("I am flying...     - Angel");
    }

    @Override
    public void changeDimensions() {
        System.out.println("Changing dimensions...     - Angel");
    }

    @Override
    public void think() {
        System.out.println("Thinking...     - Angel");
    }

    @Override
    public void born() {
        System.out.println("I am born...     - Angel");
    }

    @Override
    public void grow() {
        System.out.println("I am growing...     - Angel");
    }

    @Override
    public void eat() {
        System.out.println("I am eating...    - Angel");
    }

    @Override
    public void reproduce(int offSprings) {
        int children = offSprings*8;
        System.out.println("I have "+children+" descendants    - Angel");
    }

    @Override
    public void die() {
        System.out.println("I am dying...     - Angel");
    }

}
