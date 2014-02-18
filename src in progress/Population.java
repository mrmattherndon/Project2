
public class Population extends Info{
	private String population; //Long population;
	
	public Population(String population){
		this.population=population; //Long.parseLong(population);
	}
	
	public String toString(){
		return population; //Long.toString(population);
	}
}