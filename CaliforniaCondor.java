  
public class CaliforniaCondor extends Bird implements Endangered {

    public CaliforniaCondor(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
    		return super.getDesription() + "	" + "California Condor (winged, can fly, endangered)" ;
    }

    @Override
    public void displayConservationInformation() {
    		System.out.println("critically Endangered");
    }

    @Override
    public boolean canFly() {
        return true;
    }
}