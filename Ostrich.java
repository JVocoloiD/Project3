public class Ostrich extends Bird {
    public Ostrich(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public String getDescription() {

    }
}
