package Leecode;

public class Prob_73 {
    public void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        boolean colTag = false;


        for (int i = 0; i < R; i++) {
            if(matrix[i][0] == 0) colTag = true;
            for (int j = 1; j < C; j ++) {
               if(matrix[i][j] == 0)  {
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
               }

            }
        }

        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0) {
            for (int i = 0; i < C; i++) {
                matrix[0][i] = 0;
            }
        }

        if(colTag) {
            for (int i = 0; i < R; i++){
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {
        Prob_73 prob = new Prob_73();
        prob.setZeroes(new int[][] {{1,1,1}, {0,1,2}});
    }
}
