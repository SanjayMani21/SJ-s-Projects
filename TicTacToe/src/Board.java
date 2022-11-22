import java.util.Arrays;

public class Board {
   String[][] matrix = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
   //String[][] matrix = {{"1","2","X"},{"4","X","6"},{"X","8","9"}};
    public void Board() {



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.println(Arrays.toString(matrix[i]));
                break;
            }
        }

    }





}
