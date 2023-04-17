package Question16;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap();
        // Adding elements to HashMap
        hashMap.put("Dog", 4);
        hashMap.put("Cat", 5);
        hashMap.put("Fish", 6);
        System.out.println("HashMap: " + hashMap);

        // Getting the value for a key
        int value = hashMap.get("Dog");
        System.out.println("Value for Dog: " + value);

        // Removing an entry from HashMap
        hashMap.remove("Fish");
        System.out.println("HashMap after removing Fish: " + hashMap);

        // Checking if a key exists in HashMap
        boolean exists = hashMap.containsKey("Cat");
        System.out.println("Does Cat exist in HashMap? " + exists);


	}

}
