public abstract class Bird extends Animal implements Winged{

    private final static BirthType DEFAULT_BIRTHTYPE = BirthType.LAYS_EGGS;

    public Bird(int id, String name) {
        super(id, name, DEFAULT_BIRTHTYPE);
    }

    @Override
    public final boolean isWarmBlooded() {
        return true;
    }

    public abstract boolean canFly();
    
    public String getDesription(){
    		return "Bird";
    }
}