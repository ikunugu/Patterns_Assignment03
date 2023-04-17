package Question13;

import java.util.ArrayList;
import java.util.Vector;

public class VecorVsArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a Vector
        Vector<String> vctr = new Vector<>();

        // Adding elements to Vector
        vctr.add("apple");
        vctr.add("beetroot");
        vctr.add("carror");
        System.out.println("Vector: " + vctr);

        // Creating an ArrayList
        ArrayList<String> arrayLst = new ArrayList<>();

        // Adding elements to ArrayList
        arrayLst.add("Donkey");
        arrayLst. add("Camel");
        arrayLst.add("Elephant");
        System.out.println("ArrayList: " + arrayLst);
    }


}


