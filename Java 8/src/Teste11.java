import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Teste11 {
	
	public static void main(String[] args) {
		
		  List<Integer> num = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
		  
		  LocalDate hoje = LocalDate.now();
		  
		  	num.stream()
				  	.distinct()
					.mapToInt(n -> n)
					.forEach(n -> System.out.println(hoje.plusDays(n)));
		  
	}

}
