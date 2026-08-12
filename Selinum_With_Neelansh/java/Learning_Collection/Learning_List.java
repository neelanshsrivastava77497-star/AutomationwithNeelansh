package Learning_Collection;

import java.util.ArrayList;
import java.util.List;

public class Learning_List {

	public static void main(String[]args) {
		List<Object>students =new ArrayList<>();
		
		students.add("Neelansh");
		students.add("Tajeshwita");
		students.add("Krishna");
		students.add("Priyam");
		students.add("Raj");
		students.add("Raj");
		students.add("Swati");
		
		System.out.println(students.size());
		
		System.out.println(students.get(1));
		
		students.remove(4);
		
		System.out.println(students.get(1));
		
		
	}
}
