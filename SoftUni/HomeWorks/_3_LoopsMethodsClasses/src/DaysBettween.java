import java.util.Scanner;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Days;
public class DaysBettween {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String firstDay="12-05-2014";
		String lastDay="12-09-2015";
		String[] firstSplit=firstDay.split("-");
		String[] lastSplit=lastDay.split("-");
		DateTime before=new DateTime(Integer.parseInt(firstSplit[2]),
				Integer.parseInt(firstSplit[1]),
				Integer.parseInt(firstSplit[0]), 0, 0);
		DateTime after=new DateTime(Integer.parseInt(lastSplit[2]),
				Integer.parseInt(lastSplit[1]),
				Integer.parseInt(lastSplit[0]), 0, 0);
		int razlika=Days.daysBetween(before, after).getDays();
		System.out.println(razlika);
	}
}
