import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Teste3 {
	
	
	public static void main(String[] args) {
		
		  List<Integer> num = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
		  
		  num.sort(Comparator.comparing(n -> -n));
		  num.stream().distinct()
		    .filter(n -> n % 2 == 1)
		    .sorted(Comparator.reverseOrder())
		    //.collect(Collectors.toList())
		    .forEach( System.out::println);
		  
		  
		  
		 
		  
	}

}
