import java.util.ArrayList;
import java.util.Scanner;
public class _9_CombineListOfLetters {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> first = new ArrayList<Character>();
		ArrayList<Character> last = new ArrayList<Character>();
		ArrayList<Character> show = new ArrayList<Character>();

		for (char chr : scan.nextLine().toCharArray()) {
			first.add(chr);
		}
		for (char chr : scan.nextLine().toCharArray()) {
			last.add(chr);
		}
		show.addAll(first);

		for (int i = 0; i < last.size(); i++) {
			if (first.contains(last.get(i))) {
				continue;
			}
			else {
				show.add(' ');
				show.add(last.get(i));
			}
		}

		for (int i = 0; i < show.size(); i++) {
			System.out.print(show.get(i));
		}
	}
}
