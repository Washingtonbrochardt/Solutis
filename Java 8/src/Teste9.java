import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Teste9 {
	
	public static void main(String[] args) {
		
		  List<Integer> num = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
		  
		  double a = num.stream().mapToInt(n -> n).average().orElse(Double.NaN);
		  
		   //Double x = num.stream().collect(Collectors.averagingInt(n -> n));
		   
		   System.out.println(a);
	}

}
