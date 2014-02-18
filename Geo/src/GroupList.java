import java.util.ArrayList;
import java.util.Comparator;

/**
 *This class abstracts a list of group objects. Each group object can hold more group objects as well as info about itself. In this program,
 *groups are used to store data in a recursive way, which seems to be the intuitive way to store them.
 * </P>
 * @version 1.0
 */
public class GroupList {
	/* *An instance variable of Group, is an array of Groups of arbitrary length*/
	private ArrayList<Group> groups;
	
	/* *The name of the grouping, I.E. Country*/
	protected final String groupListName;
	
	public GroupList(String groupName){
		this.groupListName=groupName;
		groups=new ArrayList<Group>();
	}
	
	/**
	 * Adds a Group object to the list.
	 * @param Group groupToAdd
	 * @return void
	 */
	public void addToList(Group groupToAdd){
		
	}
	
	/**
	 * Sorts the list.
	 * @param Comparator<Group>
	 * @return void
	 */
	public void sortList(Comparator<Group> compareUsing){
		
	}
	
	/**
	 * Searches the list for the key.
	 * @param Group groupToSearchFor
	 * @return void
	 */
	public Group searchList(Group key){
		
		return null;
	}
	
	/**
	 * Adds a Group object to the list.
	 * @param No Parameters
	 * @return A String representation of this GroupList
	 */
	public String toString(){
		return null;
	}
}
