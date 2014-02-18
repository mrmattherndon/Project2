/**
 *This is an Info object that represents the area associated with the Group object.
 * </P>
 * @version 1.0
 */
public class Area implements Info{
	/* *The data member of Area*/
	private String area;
	
	/* *The id of Area*/
	static final byte id=2;
	
	public Area(String area){
		this.area=area;
	}
	
	/**
	 * Builds a formatted string representation of the object. Useful for debugging.
	 * @param No parameters.
	 * @return A formatted string object of all the data members.
	 */
	public String toString(){
		return area;
	}
}
