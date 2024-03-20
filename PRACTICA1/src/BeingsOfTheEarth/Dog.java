package BeingsOfTheEarth;

public class Dog extends LivingBeings implements EarthBeing {
    public double bones;
    public Dog(String name, int age, int offSprings, double bones){
        super(name, age, offSprings);
        this.name = name;
        this.age = age;
        this.offSprings = offSprings;
        this.bones = bones;
    }
    public String toString(){
        return "Dog{" + "Name: "+name +
                ", Age: " + age +
                ", Descendants: "+offSprings +
                ", Bones collected: "+bones +"}";
    }
    public void bonesCollected(double bones){
        double bonesCollected = bones/age;
        System.out.println("I have collected an average of "+bonesCollected+" bones per year    - Dog");
    }
    @Override
    public void born() {
        System.out.println("I am born   - Dog");
    }
    @Override
    public void grow() {
        System.out.println("I am growing   - Dog");
    }

    @Override
    public void eat() {
        System.out.println("I am eating   - Dog");
    }

    @Override
    public void reproduce(int offSprings) {
        System.out.println("I have "+offSprings+" descendants    - Dog");
    }

    @Override
    public void die() {
        System.out.println("I am dying   - Dog");
    }
}

