public class Horse extends Mammal {

    public Horse(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "\tHorse";
    }

}
