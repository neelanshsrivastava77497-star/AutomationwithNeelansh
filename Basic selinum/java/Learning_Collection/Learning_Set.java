package Learning_Collection;

import java.util.HashSet;
import java.util.Set;
public class Learning_Set {
	public static void main (String[]args) {
		Set<Object> HomeTown =new HashSet<>();
		
		HomeTown.add("Gonda");
		HomeTown.add("Noida");
		
		HomeTown.add("Gaziyabaad");
		HomeTown.add("Lucknow");
		
		HomeTown.add("Delhi");
		HomeTown.add("Kanpur");
		
		System.out.println(HomeTown.size());
		//System.out.println(HomeTown.get(1));
		
		HomeTown.remove("Delhi");
		
		for (Object i:HomeTown) {
			System.out.println(i);
			
		}
		
	}

}
