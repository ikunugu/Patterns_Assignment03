package Finally;

import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> square = x -> x *x ;
		System.out.println(square.apply(30));
	}

}
