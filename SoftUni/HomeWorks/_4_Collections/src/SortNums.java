import java.util.Arrays;
import java.util.Scanner;
public class SortNums {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int howMuch=scan.nextInt();
		int[] nums=new int[howMuch];
		for (int i = 0; i < howMuch; i++) {
			nums[i]=scan.nextInt();
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
