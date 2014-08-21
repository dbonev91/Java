import java.util.Scanner;
public class SmallestOfThem {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		double firstNum=scan.nextDouble();
		double secNum=scan.nextDouble();
		double thirdNum=scan.nextDouble();
		if(firstNum-secNum<0 && secNum-thirdNum<0){
			System.out.println(firstNum);
		}
		else if(secNum-firstNum<0 && firstNum-thirdNum<0){
			System.out.println(secNum);
		}
		else if(thirdNum-secNum<0 && secNum-firstNum<0){
			System.out.println(thirdNum);
		}
		else if(secNum-thirdNum<0 && thirdNum-firstNum<0){
			System.out.println(secNum);
		}
		else if(thirdNum-firstNum<0 && firstNum-secNum<0){
			System.out.println(thirdNum);
		}
		else if(firstNum-thirdNum<0 && thirdNum-secNum<0){
			System.out.println(firstNum);
		}
	}
}