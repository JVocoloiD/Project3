public class BlueWhale extends Whale implements Endangered{

    public BlueWhale(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayConservationInformation() {
        System.out.println("something");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\tBlue Whale" + "\t(lives in water, breathes air, endangered)";
    }
}
