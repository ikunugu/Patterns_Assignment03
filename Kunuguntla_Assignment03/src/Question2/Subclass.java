package Question2;

public class Subclass extends SuperClass {
	// This method overrides a public method in the superclass.
    public void publicMethod() {
        System.out.println("This is a public method in the subclass.");
    }
    
    // This method overrides a protected method in the superclass.
    protected void protectedMethod() {
        System.out.println("This is a protected method in the subclass.");
    }
    
    // This method overrides a default method in the superclass.
    void defaultMethod() {
        System.out.println("This is a default method in the subclass.");
    }
    
    // This method cannot override a private method in the superclass.
    private void privateMethod() {}


}
