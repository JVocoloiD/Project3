public class BelugaWhale extends Whale{

    public BelugaWhale(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\tBeluga Whale";
    }
}
