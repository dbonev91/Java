import java.util.Arrays;
import java.util.Scanner;
public class SortStrings {
	public static void main(String[] args){
		String[] StringsArray=new String[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<StringsArray.length; i++){
			StringsArray[i]=scan.next();
		}
		Arrays.sort(StringsArray);
		for(int i=0; i<StringsArray.length; ++i){
			System.out.println(StringsArray[i]);
		}
	}
}