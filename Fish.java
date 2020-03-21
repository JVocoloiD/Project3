public abstract class Fish extends Animal implements WaterDwellers{

    public final static BirthType DEFAULT_BIRTHTYPE = BirthType.LAYS_EGGS;

    public Fish(int id, String name) {
        super(id, name, DEFAULT_BIRTHTYPE);
    }

    @Override
    public final boolean isWarmBlooded() {
        return false;
    }

    @Override
    public final boolean breathesAir() {
        return false;
    }

}
