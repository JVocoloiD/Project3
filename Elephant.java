public class Elephant extends Mammal implements Endangered {

    public Elephant(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayConservationInformation() {
        System.out.println("something");
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "\tElephant" + "\t(endangered)";
    }

}
