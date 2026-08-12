
import java.util.ArrayList;
import java.util.List;


public class Learning_List {


	public static void main(String[] args) {
		List<Object> students = new ArrayList<>();
		students.add("Neelansh");
		students.add("Tajashwita");
		students.add("subham");
		students.add("Priyam ");
		students.add("swati");
		students.add("piyush");
		students.add("anisha ");
		students.add("Tajashwita");

		System.out.println(students.size());

		System.out.println(students.get(1));

		students.remove(5);
		System.out.println(students.get(1));
	}
}