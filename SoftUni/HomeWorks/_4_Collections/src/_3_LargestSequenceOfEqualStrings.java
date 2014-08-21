import java.util.Scanner;
public class _3_LargestSequenceOfEqualStrings {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String line=scan.nextLine();
		String[] dumichki=line.split(" ");
		int lnt=dumichki.length;
		int allWords=1;
		int counter=1;
		int positionOfWord=0;
		for (int i = 1; i < dumichki.length; i++) {
			if(dumichki[i].equals(dumichki[i-1])){
				allWords++;
			}
			else{
				allWords=1;
			}
			if(allWords>counter){
				counter=allWords;
				positionOfWord=i;
			}
		}
		for (int i = 0; i < counter; i++) {
			System.out.print(dumichki[positionOfWord] + " ");
		}
	}
}
