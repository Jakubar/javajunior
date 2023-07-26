package my.flyobj.objects;

public class Spacecraft implements Flyable {
    public String name;

    public Spacecraft(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){ return name; }


    @Override
    public void fly_obj() {
        System.out.println(name + " is " + "Spacecraft.");
    }
}
