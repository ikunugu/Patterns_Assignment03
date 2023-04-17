package Question3;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclass ob1 = new Superclass();
        ob1.getSelf();  // Output: This is a method in the superclass.
        
        Subclass ob2 = new Subclass();
        ob2.getSelf();  // Output: This is a method in the subclass.
        
        Superclass ob3 = new Subclass();
        ob3.getSelf();  


	}

}
