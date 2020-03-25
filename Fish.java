
public abstract class Fish extends Animal implements WaterDwellers{


    public Fish(int id, String name, BirthType birthType) {
        super(id, name, birthType);
    }

    @Override
    public final boolean isWarmBlooded() {
        return false;
    }
    
    public final boolean breathesAir() {
        return false;
    }
    
    public String getDescription(){
    		return "Fish";
    }

}