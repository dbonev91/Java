import java.util.Scanner;
import java.math.*;
public class DegRads {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i = 0; i < n; i++) {
			double forConvertNum=scan.nextDouble();
			String forConvertString=scan.next();
			//ako e degree
			if(forConvertString.equals("deg")){
				double converter=(forConvertNum*Math.PI)/180;
				System.out.printf("%1.6f rad \n", converter);
			}
			//ako e radian
			if(forConvertString.equals("rad")){
				double converter=forConvertNum*(180/Math.PI);
				System.out.printf("%1.6f deg \n", converter);
			}
		}
	}
}