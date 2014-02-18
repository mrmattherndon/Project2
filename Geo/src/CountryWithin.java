/**
 *This is an Info object that represents the country associated with the Group object. 
 * </P>
 * @version 1.0
 */
public class CountryWithin implements Info{
	/* *The data member of Elevation*/
	private String countryWithin;
	
	/* *The id of Elevation*/
	static final byte id=5;   
	
	public CountryWithin(String countryWithin){
		this.countryWithin=countryWithin;
	}
	
	/**
	 * Builds a formatted string representation of the object. Useful for debugging.
	 * @param No parameters.
	 * @return A formatted string object of all the data members.
	 */
	public String toString(){
		return countryWithin;
	}
}