public class Character{

	private String name;
	private  int lifepoints;
	private  String  specialability;

	public void setName(String newname){
		this.name = newname;
	}

	public void setLifepoints(int newlifePoints){
		this.lifepoints = newlifePoints;
	}

	public void setSpecialability(String newspecialability){
		this.specialability = newspecialability;
	}

	public String getName(){
		return name;
	}
	public int getLifeponts(){
		return lifepoints;
	}

	public String getSpecialability(){
		return specialability;
	}
}