public class Main {
    static int a = 1;
    static int b = 1;
    static int c = 2;

    public static void main(String[] args) {
        isAIqualToB();
        isBIqualToC();
    }

    public static void isAIqualToB(){
        boolean equal = false;
        if(a == b){
            equal = true;
        }else{
            equal = false;
        }
        System.out.println(equal);
    }

    public static void isBIqualToC(){
        boolean equal = false;
        if(b != c){
            equal = false;
        }else{
            equal = true;
        }
        System.out.println(equal);
    }
}
