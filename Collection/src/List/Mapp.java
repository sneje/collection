package List;

import java.util.HashMap;
import java.util.Set;

public class Mapp {
	public static void main(String[] arg) {
		HashMap<Integer,String> names=new HashMap<Integer,String> ();
		names.put(1, "Sudarshan");
		names.put(2, "bablu");
		names.put(3,"Sudarshan");
		names.put(2, "Neje");
		
		Set<Integer>Keys=names.keySet();
		for(int key:Keys) {
			System.out.println(key+" "+names.get(key));
			
		}
		
	

}
}
	
	
	