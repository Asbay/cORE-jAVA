package maceraoyunu;

public abstract class NormalLoc extends Location{


    public NormalLoc(String name) {
        super(name);
    }

    @Override
    boolean onLocation() {
        return false;
    }

}
