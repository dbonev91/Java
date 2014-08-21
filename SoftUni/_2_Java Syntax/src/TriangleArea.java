import java.util.Scanner; 
public class TriangleArea {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		double a1=scan.nextDouble();
		double a2=scan.nextDouble();
		double b1=scan.nextDouble();
		double b2=scan.nextDouble();
		double c1=scan.nextDouble();
		double c2=scan.nextDouble();
		double area=a1*(b2-c2)+b1*(c2-a2)+c1*(a2-b2);
		area/=2;
		area*=-1;
		System.out.println(area);
	}
}
