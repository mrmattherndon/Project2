/**
 *This is an Info object that represents the elevation associated with the Group object. 
 * </P>
 * @version 1.0
 */
public class Elevation implements Info{
	/* *The data member of Elevation*/
	private String elevation;
	
	/* *The id of Elevation*/
	static final byte id=4;   
	
	public Elevation(String elevation){
		this.elevation=elevation;
	}
	
	/**
	 * Builds a formatted string representation of the object. Useful for debugging.
	 * @param No parameters.
	 * @return A formatted string object of all the data members.
	 */
	public String toString(){
		return elevation;
	}
}