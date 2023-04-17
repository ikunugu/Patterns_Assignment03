package Question4;

public class Subclass extends Superclass {
	public static void staticMethod() {
        System.out.println("This is a static method in the subclass.");
    }
    
    // This method cannot override the private method in the superclass
    // because it has a different name and is not accessible outside of the superclass.
    public void publicMethod() {
        System.out.println("This is a public method in the subclass.");
    }


}
