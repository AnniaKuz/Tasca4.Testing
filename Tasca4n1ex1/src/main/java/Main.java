import java.util.ArrayList;

public class Main {
    /**
     * Create the list of the months of the year
     * to verify:
     * - the list has 12 posicions
     * - the list is not Null
     * - August is on the 8th position
     */

    static ArrayList<Month> months = new ArrayList<>();

    public static void main(String[] args) {
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("August"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
        //System.out.println(months.size());
    }
}
