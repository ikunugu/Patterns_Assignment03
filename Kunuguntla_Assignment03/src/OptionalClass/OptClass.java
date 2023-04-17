package OptionalClass;

import java.util.Optional;

public class OptClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[10];
		Optional<String> ing = Optional.ofNullable(str[5]);
		if(ing.isPresent()) {
			String word = str[5].toLowerCase();
			System.out.println(str);
		}
		else {
			System.out.println("string is null");
		}
		

	}

}
