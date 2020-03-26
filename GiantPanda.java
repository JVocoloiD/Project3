public class GiantPanda extends Mammal implements Endangered {

    public GiantPanda(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayConservationInformation() {
        System.out.println("endangered");
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "\tGiant Panda" + "\t(endangered)";
    }

}
