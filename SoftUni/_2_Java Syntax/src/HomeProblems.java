import java.util.Scanner;
public class HomeProblems {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		double xPrim=0;
		double yPrim=0;
		//proveravame dali to4kata ne e na vratata
		if(x>17.5 && x<20 && y>8.5 && y<13.5){
			System.out.println("Outside");
			return;
		}
		//ako e varhu kashtata (4eteriagalnika i)
		else if(x>=12.5 && x<=22.5 && y>=8.5 && y<=13.5){
			System.out.println("Inside");
			return;
		}
		//pokriva
		else if(x>=8.5 && x<=22.5 && y>=3.5 && y<=8.5){
			if(x>17.5){
				xPrim=x-17.5;
			}
			else if(x<17.5){
				xPrim=17.5-x;
			}
			if(y>8.5){
				yPrim=y-8.5;
			}
			else if(y<8.5){
				yPrim=8.5-y;
			}
			if(xPrim+yPrim<=5){
				System.out.println("Inside");
				return;
			}
			System.out.println("Outside");
			return;
		}
		//ako e dale4 ot istinata
		else{
			System.out.println("Outside");
			return;
		}
	}
}
