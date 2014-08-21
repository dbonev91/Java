import java.util.ArrayList;
public class FullHouse{
	public static void main(String[] args){
		String[] faces = {"♣", "♦", "♥", "♠" };
		String cardFace="";
		String boq="";
		int count=0;
		ArrayList<String> allCards=new ArrayList<>();
		for (int i = 0; i < faces.length; i++) {
			for (int j = 2; j < 15; j++) {
				switch(j){
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
				switch(i){
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
			}
		}
		//meshim 5te karti
		for(String card1 : allCards){
			for(String card2 : allCards){
				for(String card3 : allCards){
					for(String card4 : allCards){
						for(String card5 : allCards){
							//otpred 3kata izkarvame
							if(card1.charAt(0)==card2.charAt(0)&&card2.charAt(0)==card3.charAt(0)){
								if(card3.charAt(0)!=card4.charAt(0)&&card4.charAt(0)==card5.charAt(0)){
									System.out.printf("%s %s %s %s %s \n", card1, card2, card3, card4, card5);
									count++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}