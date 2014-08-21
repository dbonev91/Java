
import java.util.Scanner;
import java.io.*;
public class SumOfTwo {
	public static void main(String[] srgs) throws FileNotFoundException{
		Scanner scan=new Scanner(System.in);
		int firstNum=scan.nextInt();
		int secNum=scan.nextInt();
		int sumOfTwo=firstNum+secNum;
		System.out.println(sumOfTwo);
		PrintStream out=new PrintStream(new FileOutputStream("compile-and-run-commands.txt"));
		System.setOut(out);
	}
}