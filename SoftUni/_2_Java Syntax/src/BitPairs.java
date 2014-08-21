import java.util.Scanner;
public class BitPairs {
	public static void main(String[] args){
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		int nClone=n;
		int i=0;
		int prav=0;
		int firstNum=0;
		int secNum=0;
		int result=0;
		while(nClone>0){
			nClone>>=1;
			i++;
		}
		for(int b=0; b<i; b++){
			if(prav==0){
				firstNum=n&1;
				secNum=n>>b+1&1;
				prav++;
			}
			else{
				firstNum=n>>b&1;
				secNum=n>>b+1&1;
			}
			if(firstNum==secNum){
				result++;
			}
		}
		System.out.println(result);
	}
}
