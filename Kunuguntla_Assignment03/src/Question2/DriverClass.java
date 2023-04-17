package Question2;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass obj1 = new SuperClass();
        obj1.publicMethod();     // Output: This is a public method in the superclass.
        obj1.protectedMethod();  // Output: This is a protected method in the superclass.
        obj1.defaultMethod();    // Output: This is a default method in the superclass.
        // obj1.privateMethod();  // This method is not accessible in the main method.
        
        Subclass obj2 = new Subclass();
        obj2.publicMethod();     // Output: This is a public method in the subclass.
        obj2.protectedMethod();  // Output: This is a protected method in the subclass.
        obj2.defaultMethod();    // Output: This is a default method in the subclass.

        
        

	}

}
