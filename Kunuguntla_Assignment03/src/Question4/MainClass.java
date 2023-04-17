package Question4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclass.staticMethod();  // Output: This is a static method in the superclass.
        Subclass.staticMethod();    // Output: This is a static method in the subclass.
        
        // This code will not compile because privateMethod() is not visible in the subclass.
        //Subclass obj = new Subclass();
        //obj.privateMethod();
        
        Subclass obj = new Subclass();
        obj.publicMethod();  // Output: This is a public method in the subclass.
    }


	

}
