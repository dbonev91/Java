import java.util.Scanner;
public class SomeTypes {
	public static void main(String[] args){
		Scanner scanning=new Scanner(System.in);
		int x=0;
		int iNums=scanning.nextInt();
		double[] dNums=new double[2];
		while(x<2){
			dNums[x]=scanning.nextDouble();
			x++;
		}
		//pravim promenliva "bin" sadarjashta pobitovata stoinost na integera
		String bin="";
		String prefix="0";
		for(int i=8; i>=0; i--){
			int num=iNums>>i&1;
			bin+=num;
		}
		bin=prefix+bin;
		String iNumsString=Integer.toHexString(iNums);
		System.out.printf("|%1$-10s|%2$s|%3$10.2f|%4$-10.3f|", iNumsString, bin, dNums[0], dNums[1]);
	}
}
