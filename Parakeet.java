
public class Parakeet extends Bird {
	
	public Parakeet(int id, String name){
		super(id, name);
	}
	
	public boolean canFly(){
		return true;
	}
	
	public String getDescription(){
		return super.getDesription() + "	" + "Parakeet (winged, can fly)" ;
	}
}
