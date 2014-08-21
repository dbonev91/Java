import java.util.Scanner;
public class InsideOrOutsideRectangle {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		//ako to4kata e na dupkata v 4eteriagalnika
		if(x>17.5 && x<20 && y<13.5 && y>8.5){
			System.out.println("Outside");
			return;
		}
		else if(x>=12.5 && x<=22.5 && y<=13.5 && y>=6){
			System.out.println("Inside");
			return;
		}
		else{
			System.out.println("Outside");
		}
	}
}
