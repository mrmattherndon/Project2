import java.util.ArrayList;

public class GroupList {
	private static ArrayList<Group> groups=new ArrayList<Group>();
	
	public static void addToList(Group groupToAdd){
		if(groupToAdd.contains().compareToIgnoreCase("continent")==0){
			groups.add(groupToAdd);
			return;
		}
		for(Group group : groups){
			group.add(groupToAdd);
		}
		
	}
	
	public static String getString(){
		String returnString="";
		
		System.out.println();
		
		for(Group group : groups){
			returnString+=group.getStringRepresentation();
		}
		return returnString;
	}
	
}
