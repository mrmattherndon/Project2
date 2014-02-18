/**
 *This is an Info object that represents the coordinate associated with the Group object. 
 * </P>
 * @version 1.0
 */
public class Coordinates implements Info{
	/* *The data member of Coordinates*/
	private String coordinates;
	
	/* *The id of Coordinates*/
	static final byte id=3;   
	
	public Coordinates(String coordinates){
		this.coordinates=coordinates;
	}
	
	/**
	 * Builds a formatted string representation of the object. Useful for debugging.
	 * @param No parameters.
	 * @return A formatted string object of all the data members.
	 */
	public String toString(){
		return coordinates;
	}
}