package kz.kre.preferences;

import java.util.Random;



public class Launcher {

    public static void main(String[] args) {
        
        int matrixRow = 5;
        int matrixColumn = 6;
        int[][] matrix = new int[matrixRow][matrixColumn];
        int temp;
        
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixColumn; j++) {
                matrix[i][j] = r.nextInt(21) - 10;
            }
        }

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixColumn; j++) {
                System.out.print(matrix[i][j] + "         ");
            }
            System.out.print("\n");
        }
        
//        
//        for (int i = 0; i < 1000; i++) {
//            int q = r.nextInt(21) - 10;
//            System.out.println(q);
//        }

    }

}
