import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Teste10 {
	
	public static void main(String[] args) {
		
		  List<Integer> num = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
		  
		  num.stream().mapToInt(n -> n).summaryStatistics();
//		  long x = num.stream().count();
//		  
//		  int sum = num.stream()
//					.mapToInt(n -> n)
//					.sum();
//		  
//		  OptionalDouble media = num.stream().mapToInt(n -> n).average();
//		  
//		  Optional<Integer> max = num.stream().max(Comparator.comparing(n -> n));
//		  
//		  System.out.println(x);
//		  System.out.println(sum);
//		  System.out.println(media);
//		  System.out.println(max);
	}
	

}
