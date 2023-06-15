package maceraoyunu;

public abstract class Location {

    String name;
    Player p1= new Player();


    public Location(String name) {
        this.name = name;
    }

    abstract boolean onLocation();
}
