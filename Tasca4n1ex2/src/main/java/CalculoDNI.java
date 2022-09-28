import java.util.ArrayList;


public class CalculoDNI {
    static ArrayList<String> letters = new ArrayList<String>();

    public static String calculateLetter(String numDNI) {
        letters.add("T");
        letters.add("R");
        letters.add("W");
        letters.add("A");
        letters.add("G");
        letters.add("M");
        letters.add("Y");
        letters.add("F");
        letters.add("P");
        letters.add("D");
        letters.add("X");
        letters.add("B");
        letters.add("N");
        letters.add("J");
        letters.add("Z");
        letters.add("S");
        letters.add("Q");
        letters.add("V");
        letters.add("H");
        letters.add("L");
        letters.add("C");
        letters.add("K");
        letters.add("E");


        String ans = "";

        if (numDNI.length() == 8) {
            try {
                int DNI = Integer.parseInt(numDNI);
                String letterDNI ="";
                letterDNI = letters.get(DNI % 23);
                ans = "The correct letter for this DNI is " + letterDNI;
            } catch (NumberFormatException ex) {
                ans = "Invalid DNI format";
            }
        } else {
            ans = "Invalid DNI format";
        }
        return ans;
    }

}

