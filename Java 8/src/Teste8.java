import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Teste8 {
	
	public static void main(String[] args) {
		
		  List<Integer> num = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
		  
		  num.stream().limit(3).forEach(System.out::println);
	}

}
