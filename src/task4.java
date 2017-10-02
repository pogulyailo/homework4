public class task4 {

    public static int getMax(int a, int b){
        if (a > b) {
            return a;
        }
        return b;
    }

public static float getMax (float a, float b){
     if (a > b) {
             return a;
             }
             return b;
             }

public static void main(String[] args) {

    System.out.println(getMax(8, 18));
    System.out.println(getMax(8.6f, 17.3f));
}
}