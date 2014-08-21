import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class RandCards {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String cardFace="";
		String boq="";
		ArrayList<String> allCards=new ArrayList<>();
		int count=0;
		int n=scan.nextInt();
		for (int i = 2; i < 15; i++) {
			for (int j = 0; j < 4; j++) {
				switch(i){
				case 2:
					cardFace="2";
					break;
				case 3:
					cardFace="3";
					break;
				case 4:
					cardFace="4";
					break;
				case 5:
					cardFace="5";
					break;
				case 6:
					cardFace="6";
					break;
				case 7:
					cardFace="7";
					break;
				case 8:
					cardFace="8";
					break;
				case 9:
					cardFace="9";
					break;
				case 10:
					cardFace="10";
					break;
				case 11:
					cardFace="J";
					break;
				case 12:
					cardFace="Q";
					break;
				case 13:
					cardFace="K";
					break;
				case 14:
					cardFace="A";
					break;
				}
				switch(j){
				case 0:
					boq="♥";
					break;
				case 1:
					boq="♠";
					break;
				case 2:
					boq="♦";
					break;
				case 3:
					boq="♣";
					break;
				}
				allCards.add(cardFace + boq);
				count++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				String getter=allCards.get(new Random().nextInt(count));
				System.out.print(getter + " ");
			}
			System.out.println();
		}
	}
}
