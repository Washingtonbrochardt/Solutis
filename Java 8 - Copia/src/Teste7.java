import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Teste7 {
	public static void main(String[] args) {
		
		  List<Integer> num = Arrays.asList();
		  
		  
		  
		  Integer max = num.stream().max(Comparator.comparing(n -> n)).orElseThrow(NoSuchElementException::new);
		  
		  System.out.println(max);
	}
}
