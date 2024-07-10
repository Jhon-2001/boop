import java.util.Arrays;

public class ComplexMatrix {
    private Complex[][] matrix;
    private int rows;
    private int cols;

    public ComplexMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new Complex[rows][cols];
    }

    public void Initialize(Complex[][] matrix) {
        this.matrix = matrix;
    }

    public void setElement(int row, int col, Complex value) {
        matrix[row][col] = value;
    }

    public ComplexMatrix add(ComplexMatrix b) {
        ComplexMatrix result = new ComplexMatrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setElement(i, j, this.matrix[i][j].add(b.matrix[i][j]));
            }
        }
        return result;
    }

    public ComplexMatrix sub(ComplexMatrix b) {
        ComplexMatrix result = new ComplexMatrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setElement(i, j, this.matrix[i][j].substract(b.matrix[i][j]));
            }
        }
        return result;
    }

    //    public ComplexMatrix multiply(ComplexMatrix b){
//        ComplexMatrix result = new ComplexMatrix(rows, cols);
//        for (int i = 0; i < rows; i++){
//            for (int j = 0; j < cols; j++){
//                Complex sum = new Complex(0, 0);
//                for (int k=0; k)
//
//            }
//        }
//
//        return result;
//    }
    @Override
    public String toString() {
        String response = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                response = response + matrix[i][j] + "  ";
            }
            response += "\n";
        }

        return response;
    }
}
