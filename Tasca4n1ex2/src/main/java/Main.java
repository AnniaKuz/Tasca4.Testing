import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        CalculoDNI dni = new CalculoDNI();
        String ans = "";
        String numDNI = "";
        System.out.println("Enter the numbers of DNI");
        numDNI = scan.next();
        ans = dni.calculateLetter(numDNI);
        System.out.println(ans);

    }

}

