public class RotateMatrix {


    public void rotateMatrix(int[][] matrix) {

        //transpose of matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        print(matrix);

        //reverse each row. 
        for (int i = 0; i < matrix.length; i++) {
            int len = matrix[0].length;
            for (int j = 0; j < len / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-j-1];
                matrix[i][len-j-1] = temp;
            }
        }

        print(matrix);


    }

    private void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {


        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.rotateMatrix(matrix);

    }
}
