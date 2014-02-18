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
	private char[] structure;
	private String structureName;
	
	public DataStructure(String structure,String structureName){
		this.structure=structure.toCharArray();
		this.structureName=structureName;
	}
	
	/**
	 *parses a line of text and pulls out the appropriate data members.<br>
	 * Algorithm:<br>
	 * 1. Find the next comma in the line, save its index to lastCommaIndex.<br>
	 * 2. If the current CountryInfo object can contain commas, check if the next data member is formatted in the same way<br>
	 * 3. If the next data member is formatted similarly, continue until the next comma is reached. If not, move to next data type 
	 * by incrementing currentID<br>
	 * 4. CurrentID represents the current index within the structure string. The current data member's datatype is determined by reading the charAt(currentID) 
	 * of structure and interpreting it appropriately.
	 * </P>
	 * @param String line.
	 * @return A Country object.
	 **/
	public Info[] getInfoFromText(String line){
		ArrayList<Info> groupInfo=new ArrayList<Info>();
		
		int lastComma=0;
		int currentId=0;
		boolean hasSkippedCommaOnce=false;
		
		/*
		 * parses each line
		 */
		for(int i=0;i<line.length();i++){
			if(currentId>structure.length-1){	//this conditional handles when the data isn't formatted correctly by closing the program.
				break;
				//return null;
			}
//			else if(i==(line.length()-1) && currentId!=(structure.length-1)){
//				return null;
//			}
			if(line.charAt(i)==','){
//				if(!hasSkippedCommaOnce && currentId==0){ //this conditional handles alphabetic strings that may contain comments. Only works for first data member at this point.
//					if(!Character.isDigit(line.charAt(i+1))){
//						i++;
//					}else{
//						groupInfo.add(Group.buildGroup(line.substring(lastComma,i),structure[currentId]));
//						lastComma=i+1;
//						currentId++;
//					}
//					hasSkippedCommaOnce=true;
//				}else{
					groupInfo.add(Info.buildInfoObject(line.substring(lastComma,i),structure[currentId]));
					lastComma=i+1;
					currentId++;
				//}
			}else if(i==(line.length()-1)){
				groupInfo.add(Info.buildInfoObject(line.substring(lastComma),structure[currentId]));
				lastComma=i+1;
				currentId++;
			}
		}		
		/*
		 * builds a generic array of 'Country's to satisfy return type. 
		 */
		Object[] objects=groupInfo.toArray(); 
		Info[] countryInfoArray=new Info[objects.length];
		for(int i=0;i<countryInfoArray.length;i++){
			countryInfoArray[i]=(Info)(objects[i]);
		}
		return countryInfoArray;

	}
}
