package inc.dec.oprtr;

import java.util.List;
import java.util.stream.Collectors;

public class ArithPreIncrement {

	public static void main(String[] args) {

		int a = 3;

		int b = 3 * ++a; // 3 * 4 = 12

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	
	public List<Integer> stringToInteger(List<String> stringList){
		
		return stringList.stream().map(string -> Integer.parseInt(string)).collect(Collectors.toList());
		
	}
}
