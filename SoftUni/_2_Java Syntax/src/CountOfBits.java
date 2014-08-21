import java.util.Scanner; 
public class CountOfBits {
	public static void main(String[] args){
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		int nClone=n;
		int i=1;
		int count=0;
		int broiEdinici=0;
		int koiPat=0;
		int cifra=0;
		while(n>0){
			n>>=i;
			count++;
		}
		for(int b=count; b>0; b--){
			if(koiPat==0){
				cifra=nClone&1;
			}
			else{
				cifra=nClone>>b&1;
			}
			koiPat++;
			if(cifra==1){
				broiEdinici++;
			}
		}
		System.out.println(broiEdinici);
	}
}
