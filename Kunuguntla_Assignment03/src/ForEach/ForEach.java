package ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		numbers.forEach((Integer value) -> System.out.println(value));
		
	}

}
