package Question17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("beetroot");
        arrayList.add("carrot");
        // Creating a fail-fast iterator
        Iterator<String> failFastIterator = arrayList.iterator();
        // Modifying the ArrayList while iterating over it
        while (failFastIterator.hasNext()) {
            String element = failFastIterator.next();
            if (element.equals("beetroot")) {
                arrayList.remove(element);
            }
        }
        // Creating a fail-safe iterator
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(arrayList);
        Iterator<String> failSafeIterator = copyOnWriteArrayList.iterator();
        // Modifying the ArrayList while iterating over it
        while (failSafeIterator.hasNext()) {
            String element = failSafeIterator.next();
            if (element.equals("beetroot")) {
                copyOnWriteArrayList.remove(element);
            }
        }


	}

}
