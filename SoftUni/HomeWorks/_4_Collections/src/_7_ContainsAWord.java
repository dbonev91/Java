import java.util.Scanner;
public class _7_ContainsAWord {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String txt=scan.nextLine().toLowerCase();
		String word=scan.nextLine().toLowerCase();
		int counter=0;
		for (int i = 0; i <= txt.length()-word.length(); i++) {
			if(txt.substring(i, word.length()+i).contains(word)){
				counter++;
			}
		}
		System.out.println(counter);
	}
}
