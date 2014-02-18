/**
 *This is an Info object that represents the continent associated with the Group object. 
 * </P>
 * @version 1.0
 */
public class ContinentWithin implements Info{
	/* *The data member of Elevation*/
	private String continentWithin;
	
	/* *The id of Elevation*/
	static final byte id=6;   
	
	public ContinentWithin(String continentWithin){
		this.continentWithin=continentWithin;
	}
	
	/**
	 * Builds a formatted string representation of the object. Useful for debugging.
	 * @param No parameters.
	 * @return A formatted string object of all the data members.
	 */
	public String toString(){
		return continentWithin;
	}
}