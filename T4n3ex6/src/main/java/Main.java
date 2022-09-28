
public class Main {
    static int [] numbers = new int[3];

    public static void main(String[] args) {

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        throwsException();
    }
    public static void throwsException(){
        try{
            numbers[3] = 3;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }

}
