import java.util.Scanner;
public class _4_LongestIncreaseSequence {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String line=scan.nextLine();
		String[] splitter=line.split(" ");
		int[] nums=new int[splitter.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=Integer.parseInt(splitter[i]);
		}
		int counter=1;
		int countTemp=1;
		int positionOfInt=0;
		System.out.print(nums[0] + " ");
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]>nums[i-1]){
				System.out.print(nums[i] + " ");
				countTemp++;
			}
			else{
				countTemp=1;
				System.out.println();
				System.out.print(nums[i] + " ");
			}
			if(countTemp>counter){
				counter=countTemp;
				positionOfInt=i;
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int i = 0; i < counter; i++) {
			System.out.print(nums[positionOfInt - counter + i + 1] + " ");
		}
	}
}