package BeingsOfTheEarth;

public abstract class LivingBeings{
    public String name;
    public int age;
    public int offSprings;
    public LivingBeings(String name, int age, int offSprings){
        this.name = name;
        this.age = age;
        this.offSprings = offSprings;
    }
    public abstract String toString();
    public abstract void born();
    public abstract void grow();
    public abstract void reproduce(int offSprings);
    public abstract void die();


}
