import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GeoDriver {
	public static void main(String[] args){
		
		
		
		GeoDriver.readInfoFromFiles();
	}
	
	public static void readInfoFromFiles(){
		String[] paths={"\\Users\\Matthew\\Google Drive\\College\\Current Classes\\C S 2234\\Project 2\\continents.csv",
				"\\Users\\Matthew\\Google Drive\\College\\Current Classes\\C S 2234\\Project 2\\countries.csv",
				"\\Users\\Matthew\\Google Drive\\College\\Current Classes\\C S 2234\\Project 2\\cities.csv"};
		DataStructure[] dataStructures=new DataStructure[]{new DataStructure("012","Continent"),new DataStructure("012","Country"),new DataStructure("012","Country")};
		
		BufferedReader bufferedReader;
		
		String currentLine;
		Group parsedGroup;
		
		for(int i=0;i<3;i++){
			try {
				bufferedReader = new BufferedReader(new FileReader(paths[i]));
				try {
					currentLine = bufferedReader.readLine();
					
					while(currentLine!=null){
						switch(i){
						case 0:
							parsedGroup=new Group(dataStructures[i].getInfoFromText(currentLine),"country","continent",false);
							break;
						case 1:
							parsedGroup=new Group(dataStructures[i].getInfoFromText(currentLine),"city","continent","country");
							break;
						case 2:
							parsedGroup=new Group(dataStructures[i].getInfoFromText(currentLine),"country","city",true);
							break;
						default:
							parsedGroup=null;
						}
						/*
						 * null only occurs when dataStructure.getInfoFromText() sends the kill signal (aka a null Country Object). 
						 * Used to kill program and alert the user with the appropriate error.
						 */
//						if(parsedGroup==null){ 
//							bufferedReader.close();
//							break;
//						}
						GroupList.addToList(parsedGroup);
						
						currentLine=bufferedReader.readLine();
					}
					bufferedReader.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		System.out.println(GroupList.getString());
	}
}
