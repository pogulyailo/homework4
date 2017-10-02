public class task3 {
    static String drawRectangle(int anna, int boris, char c) {
        String result = "";
        for(int i = 0; i < boris; i++) {
            String line = "";
            for(int j = 0; j < anna; j++) {
                line += c;
            }
            result += line + "\n";
        }
        return result;
    }
    static String drawRectangle(int boris, char c) {
        String result = "";
        for(int i = 0; i < boris; i++) {
            String line = "";
            for(int j = 0; j < boris; j++) {
                line += c;
            }
            result += line + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(drawRectangle(4, 2, '+'));
        System.out.println(drawRectangle(2, '+'));
    }
}
