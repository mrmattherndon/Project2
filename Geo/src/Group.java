/**
 *This class abstracts a "group" into an object that is capable of accepting an arbitrary number of Info objects as constructor arguments.
 * </P>
 * @version 1.0
 */
public class Group {
	/* *An instance variable of Group, is an array of Info of arbitrary length*/
	private Info[] Info;
	
	/* *Another instance variable of Group, useful for identifying what kind of group a particular Group object is representing*/
	protected String groupingName;
	
	public Group(Info[] Info,String groupingName) {
		
	}
		
	/**
	 * Retrieves the Info object corresponding to the "id" given.
	 * @param A char, the id of the data to grab
	 * @return A String object containing the data member asked for.
	 */
	public String getSpecificInfo(char id){
		
		return null;
	}
	
	/**
	 * Builds an infoObject based on the parameters passed to it.
	 * @param The data as a String, the id of the object type to be created.
	 * @return A specific CountryInfo object.
	 */
	public static Info buildInfoObject(String data,char id){
		
		return null;
	}
	
	/**
	 * Builds a formatted string representation of the object. Useful for debugging.
	 * @param No parameters.
	 * @return A formatted string object of all the data members.
	 */
	public String getString(){
		return null;
	}
}