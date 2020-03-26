public abstract class Mammal extends Animal {

    private final static BirthType DEFAULT_BIRTHTYPE = BirthType.LIVE_BIRTH;

    public Mammal(int id, String name) {
        super(id, name, DEFAULT_BIRTHTYPE);
    }

    public Mammal(int id, String name, BirthType birthType) {
        super(id, name, birthType);
    }

    @Override
    public final boolean isWarmBlooded() {
        return true;
    }

    @Override
    public String getDescription() {
        return "Mammal";
    }
}