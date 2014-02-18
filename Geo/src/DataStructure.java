import java.util.ArrayList;

/**
 *This class, once instantiated with an appropriate dataStructure map,
 *handles the parsing of lines of text sent to its getInfoFromText method. 
 *The reason I chose to do was to allow this program to be used with other files
 *that might not necessarily be structured in the same way (for instance, rather
 *than name coming first, continent might come first).
 * </P>
 * @version 1.0
 */
public class DataStructure {
	/* * A string of numbers representing the id the CountryInfo object*/
	private byte[] structure;

	public DataStructure(byte[] structure){
		this.structure=structure;
	}
	
	/**
	 *parses a line of text and pulls out the appropriate data members.<br>
	 * Algorithm:<br>
	 * 1. Find the next comma in the line, save its index to lastCommaIndex.<br>
	 * 2. If the current CountryInfo object can contain commas, check if the next data member is formatted in the same way<br>
	 * 3. If the current data member expects next data member is formatted similarly, continue until the next comma is reached. If not, move to next data type 
	 * by incrementing currentID<br>
	 * 4. CurrentID represents the current index within the structure string. The current data member's datatype is determined by reading the charAt(currentID) 
	 * of structure and interpreting it appropriately.
	 * </P>
	 * @param String line.
	 * @return A Country object.
	 **/
	public Info[] getInfoFromText(String line){
		return null;
	}
}
