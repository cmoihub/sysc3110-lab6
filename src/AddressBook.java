import java.util.*;
import javax.swing.WindowConstants;

public class AddressBook implements WindowConstants
{
	private static List<BuddyInfo> buddies;
	public AddressBook() {
		buddies = new ArrayList<>();	
	}
	
	public void addBuddy(BuddyInfo buddy)
	{
		if(buddy != null && buddies.contains(buddy)==false) buddies.add(buddy);
	}
	
	public String getBuddyInfo(){
		String s = "";
		for(BuddyInfo buddy:buddies){
			return s = "" + buddy.toString() + "\n";
		}
		return s;
	}
	
	public void removeBuddy(int index)
	{
		if(index>=0 && index <buddies.size())
			buddies.remove(index);
	}
	
	public int size()
	{
		return buddies.size();
	}
	
	public void clear()
	{
		buddies.removeAll(buddies);
	}
}