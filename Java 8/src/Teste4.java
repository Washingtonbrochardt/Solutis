import java.util.Arrays;
import java.util.List;

public class Teste4 {
	
	public static void main(String[] args) {
		
		  List<Integer> num = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
		  
		  int som = num.stream().skip(3).mapToInt(n->n).sum();
		  
		  System.out.println(som);
		  
		  
	}

}
