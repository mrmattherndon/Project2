/**
 *This is an Info object that represents the population associated with the Group object.
 * </P>
 * @version 1.0
 */
public class Population implements Info{
	/* *The data member of Population*/
	private String population;
	
	/* *The id of Area*/
	static final byte id=1;
	
	public Population(String population){
		this.population=population;
	}
	
	/**
	 * Builds a formatted string representation of the object. Useful for debugging.
	 * @param No parameters.
	 * @return A formatted string object of all the data members.
	 */
	public String toString(){
		return population; 
	}
}