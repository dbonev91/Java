import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class _10_10 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] txt = scan.nextLine().toLowerCase().split("\\W+");
		Set<String> offSet = new TreeSet<>();
		for (String words : txt) {
			offSet.add(words);
		}

		for (String words : offSet) {
			System.out.print(words + " ");
		}
	}
}
