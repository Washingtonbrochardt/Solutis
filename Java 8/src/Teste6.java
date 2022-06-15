import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste6 {
	
	public static void main(String[] args) {
		
		  List<Integer> num = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
		  
		  List<Integer> imp = num.stream().distinct()
		    .filter(n -> n % 2 == 1)
		    .collect(Collectors.toList());
		  
		  List<Integer> par = num.stream().distinct()
				    .filter(n -> n % 2 == 0)
				    .collect(Collectors.toList());
		  
		  System.out.println(imp);
		  System.out.println(par);
		  
	}
}

