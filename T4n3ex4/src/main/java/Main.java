import java.util.ArrayList;

public class Main {
    static ArrayList<Local> locals = new ArrayList<>();
    public static void main(String[] args) {
        Restaurant rest1 = new Restaurant("Don Juan", true);
        Restaurant rest2 = new Restaurant("Pizzeria Mario", false);
        Bar bar1  = new Bar("Mojito", true);
        Bar bar2 = new Bar("Day&Night", true);

        locals.add(rest1);
        locals.add(rest2);
        locals.add(bar1);
        System.out.println(rest1+ " > " + locals.indexOf(rest1));
        System.out.println(rest2+ " > " + locals.indexOf(rest2));
        System.out.println(bar1+ " > " + locals.indexOf(bar1));
    }
}
