public class task6 {
    public void recursion2(int height, int width){
        if(width < 1){
            return;
        } else{
            drawLine(height);
            System.out.println();
            recursion2(height, width - 1);
        }
    }

    public void drawLine(int count){
        if(count < 1){
            return;
        } else {
            System.out.print("+");
            drawLine(count - 1);
        }
    }
}