package List;

import java.util.ArrayList;

public class Listt {
public static void main(String[]arg) {
	ArrayList<String> names=new ArrayList();
	names.add("Sudarshan");
	names.add("Shantinath");
	names.add("Bablu");
	names.add("Sudarshan");
	names.add(" ");
	for(String name:names) {
		System.out.println(name);
	}
	
	
}
}
