import java.util.Scanner;
public class _6_SpecificWord {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String txt=scan.nextLine();
		String charter=scan.next();
		String[] allOfThem=txt.split("\\W+");
		int counter=0;
		for (int i = 0; i < allOfThem.length; i++) {
			if(charter.equals(allOfThem[i])){
				counter++;
			}
		}
		System.out.println(counter);
	}
}