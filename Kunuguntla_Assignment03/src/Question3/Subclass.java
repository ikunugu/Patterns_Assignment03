package Question3;

public class Subclass extends Superclass {
    Subclass getSelf() {
        System.out.println("This is a method in the subclass.");
        return this;
    }


}
