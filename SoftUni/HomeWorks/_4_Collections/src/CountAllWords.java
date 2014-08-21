import java.util.Scanner;
public class CountAllWords {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String txt=scan.nextLine();
		String[] splitter=txt.split("\\W+");
		System.out.println(splitter.length);
	}
}
