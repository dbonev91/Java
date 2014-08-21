import java.util.Scanner;
public class TribleLetter {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		char[] bukvichki=new char[word.length()];
		int count=0;
		for(int i=0; i<word.length(); i++){
			bukvichki[i]=word.charAt(i);
		}
		for(char bukva1 : bukvichki){
			for(char bukva2 : bukvichki){
				for(char bukva3 : bukvichki){
					System.out.printf("%s%s%s ", bukva1, bukva2, bukva3);
				}
			}
		}
	}
}