public abstract class Whale extends Mammal implements WaterDwellers {

    public Whale(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean breathesAir() {
        return true;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\tWhale";
    }
}
