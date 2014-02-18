/**
 *This is an Info object that represents the name associated with the Group object. 
 * </P>
 * @version 1.0
 */
public class Name implements Info{
	/* *The data member of Name*/
	private String name;
	
	/* *The id of Name*/
	static final byte id=0;   
	
	public Name(String name){
		this.name=name;
	}
	
	/**
	 * Builds a formatted string representation of the object. Useful for debugging.
	 * @param No parameters.
	 * @return A formatted string object of all the data members.
	 */
	public String toString(){
		return name;
	}
}
