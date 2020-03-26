public class DuckbilledPlatypus extends Mammal {

    public static final BirthType DEFAULT_BIRTHTYPE = BirthType.LAYS_EGGS;

    public DuckbilledPlatypus(int id, String name) {
        super(id, name, DEFAULT_BIRTHTYPE);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\tDuckbilled Platypus";
    }
}