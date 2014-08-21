import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class _11_Frequent {
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
            String[] words =  scan.nextLine().split("\\W+");
            TreeMap<String, Integer> showWords = new TreeMap<>();
           
            int maxWords = 0;
            for (String word : words) {
                word = word.toLowerCase();
                Integer wordNum = showWords.get(word);
                if (wordNum == null) {
                	wordNum = 0;
                }
                if (wordNum + 1 > maxWords) maxWords = wordNum + 1;
                showWords.put(word, wordNum + 1);
            }
           
            for (Map.Entry<String, Integer> entry : showWords.entrySet()) {
                if (entry.getValue() == maxWords) {
                    System.out.println(entry.getKey() + " -> "  + maxWords + " times");
                }
            }
		}
		catch (Exception e) {
			e.printStackTrace();
	    }
	}
}
