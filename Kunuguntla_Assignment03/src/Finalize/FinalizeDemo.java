package Finalize;

public class FinalizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeDemo ob = new FinalizeDemo();
		// printing hash code
		System.out.println("Hshcode is  :" +ob.hashCode());
		ob = null;
		//calling garbage collector 
		System.gc();
		System.out.println("end of the garbage collection");

	}
	//defining finalize method
	protected void finalize()
	{
		System.out.println("called the finalize method");
	}

}
