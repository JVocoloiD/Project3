
public class GreatWhiteShark extends Fish implements Endangered {
	
	public final static BirthType DEFAULT_BIRTHTYPE = BirthType.LIVE_BIRTH;

	public GreatWhiteShark(int id, String name){
		super(id, name, DEFAULT_BIRTHTYPE);
	}
	
	public String getDescription(){
		return super.getDescription() + "	"	+ "(lives in water, does not breath air, endangered)";	
	}
    @Override
    public void displayConservationInformation() {
    		System.out.println("Vulnerable");
    }
}