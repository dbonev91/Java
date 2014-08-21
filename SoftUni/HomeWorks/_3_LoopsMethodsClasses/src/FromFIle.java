import java.io.BufferedReader;
import java.io.FileReader;
public class FromFIle {
	public static void main(String[] args){
		try{
			BufferedReader reader=new BufferedReader(new FileReader("Input.txt"));
			String line=null;
			int num=0;
			while((line=reader.readLine())!=null){
				num+=Integer.parseInt(line);
			}
			System.out.println(num);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
