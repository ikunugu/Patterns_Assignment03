package lamdaExp;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<String> fruit = Arrays.asList("avacado", "orange","pomegranite","Kiwi");
 fruit.forEach((fruits -> System.out.println(fruits)));
 
	}

}
