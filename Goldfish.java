
public class Goldfish extends Fish {
    public final static BirthType DEFAULT_BIRTHTYPE = BirthType.LAYS_EGGS;
	public Goldfish(int id, String name){
		super(id, name, DEFAULT_BIRTHTYPE);
	}
	
	public String getDescription(){
		return super.getDescription() + "	"	+ "(lives in water, does not breath air)";	
	}
}