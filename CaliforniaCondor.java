public class CaliforniaCondor extends Bird implements Endangered {

    public CaliforniaCondor(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {

    }

    @Override
    public void displayConservationInformation() {

    }

    @Override
    public boolean canFly() {
        return false;
    }
}
