public class task5 {
    public static String recursion(int alex){

    if(alex == 1) {
        return "1";
    }
        return
    recursion(alex - 1) + " " + alex;
}
    public static void main(String[] args){

        System.out.println(recursion (5));
    }
}

