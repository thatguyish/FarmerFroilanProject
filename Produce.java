package mcfroilan;

public interface Produce extends Edible {

    public abstract boolean hasBeenFertilized();

    public abstract boolean hasBeenHarvested();

    public abstract void yield(Edible hasBeenFertilized);

}
