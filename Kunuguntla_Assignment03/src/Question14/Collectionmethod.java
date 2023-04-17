package Question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class Collectionmethod {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<>();
		//adding elements to the list
		lst.add("apple");
		lst.add("beans");
		lst.add("carrot");
		//making list synchronized 
		List<String> synchronizedLst = Collections.synchronizedList(lst);
		//adding elements to synchronized list
		synchronized(synchronizedLst) {
			synchronizedLst.add("donkey");
			synchronizedLst.add("elephant");
			synchronizedLst.add("fish");
			//using copyonwrite arraylist
			List<String> copyonWrteLst = new CopyOnWriteArrayList<>(lst);
			copyonWrteLst.add("monkey");
			Iterator<String> it = lst.iterator();
			while(it.hasNext()) {
				String str = it.next();
				System.out.println(str);
						
			}
			
			
			
		}
		
		
		

	}

}
