import java.util.ArrayList;
import java.util.HashMap;

public class Group {
	private Info[] infoObjects; //standardized across all groups, Name comes first in Array
	private ArrayList<Group> groups;
	private HashMap<String,Integer> map=new HashMap<String,Integer>();
	
	private String groupName;
	private String contains;
	private String groupedUnder;
	private boolean isFinal;
	
	public Group(Info[] infoObjects,String contains,String groupedUnder,String groupName){		
		this.infoObjects=infoObjects;
		this.groupName=groupName;
		
		this.contains=contains;
		this.groupedUnder=groupedUnder;	
		this.groups=new ArrayList<Group>();
	}
	
	public Group(Info[] infoObjects,String groupName,String groupedUnderOrContains,boolean isFinal){
		this.infoObjects=infoObjects;
		this.groupName=groupName;
		if(isFinal){
			this.groupedUnder=groupedUnderOrContains;
			this.groups=null;
		}else{
			this.contains=groupedUnderOrContains;
			this.groups=new ArrayList<Group>();
		}
	}

	public String getName(){
		return infoObjects[0].toString();
	}
	
	public String groupName(){
		return groupName;
	}
	public String contains(){
		return contains;
	}
	public String groupedUnder(){
		return groupedUnder;
	}
	
	
	public void add(Group groupToAdd){
		if(groupToAdd.groupedUnder().compareToIgnoreCase(contains)==0){
			for(Group group : groups){
				group.add(groupToAdd);
			}
			return;
		}
	}
	
	
//	public void addToAppropriateGroup(String groupToAddTo,Group groupToAdd){
//		if(groups==null){
//			return;
//		}
//		if(groupToAddTo.compareToIgnoreCase(groupName)==0){
//			groups.add(groupToAdd);
//			
//			System.out.println(groupToAddTo);
//			return;
//		}
//		for(Group group : groups){
//			if(group.getName().compareToIgnoreCase(groupToAdd.getName())==0){
//				group.addToGroup(groupToAdd);
//			}else{
//				group.addToAppropriateGroup(groupToAddTo,groupToAdd);
//			}
//		}
//	}
//	
//	public void addToGroup(Group groupToAdd){
//		groups.add(groupToAdd);
//	}
//	
	
	
	
	public String getStringRepresentation(){
		String result="";
		
		System.out.println("SR");
		
		for(Info object : infoObjects){
			if(object instanceof Name){
				result+=contains+": "+object.toString()+"\n";
			}else{
				result+=object.toString();
			}
		}
		if(groups!=null){
			for(Group groupIterator : groups){
				result+=String.format("%5s",groupIterator.toString());
			}
		}
		return result;
	}
}
