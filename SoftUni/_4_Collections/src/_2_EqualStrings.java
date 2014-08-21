import java.util.Scanner;
public class _2_EqualStrings {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String dumichki=scan.nextLine();
		String[] dumiCont=dumichki.split(" ");
		String checkFirst="";
		String checkSecond="";
		System.out.print(dumiCont[0]);
		for (int i = 1; i < dumiCont.length; i++) {
			if(dumiCont[i].equals(dumiCont[i-1])){
				System.out.print(" " + dumiCont[i]);
			}
			else{
				System.out.println();
				System.out.print(dumiCont[i]);
			}
		}
	}
}
