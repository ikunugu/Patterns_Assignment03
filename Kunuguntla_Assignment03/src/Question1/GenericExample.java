package Question1;

public class GenericExample<x> {
	private  x value;
	public GenericExample(x value) {
		super();
		this.value = value;
	}
	public x getValue() {
		return value;
	}
	public void setValue(x value) {
		this.value = value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericExample<Integer> exmp1 = new GenericExample<>(50);
        System.out.println(exmp1.getValue()); // Output: 10

        GenericExample<String> exmp2 = new GenericExample<>("Hello, Indu!");
        System.out.println(exmp2.getValue()); // Output: Hello, World!
    }


	}

