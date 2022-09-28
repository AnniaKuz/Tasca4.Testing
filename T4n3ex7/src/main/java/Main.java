public class Main {
    public static void main(String[] args) {
        Optional op = null;

        System.out.println("Is Optionla op null? > " + isOptionalNull(op));
    }

    public static boolean isOptionalNull(Optional op){
        boolean isNull = false;
        if(op == null){
            isNull = true;
        }else{
           isNull = false;
        }
        return isNull;
    }
}
