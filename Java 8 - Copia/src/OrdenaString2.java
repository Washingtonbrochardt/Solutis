import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString2 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		palavras.forEach(t -> System.out.println(t));
		
		palavras.forEach(System.out::println);
		
		

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.sort(Comparator.comparing(String::length));
	}
	
	

}
