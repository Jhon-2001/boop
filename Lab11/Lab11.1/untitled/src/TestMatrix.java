public class TestMatrix {
    public static void main(String[] args) {
        DoubleMatrix doubleMatrix = new DoubleMatrix();
        LongMatrix longMatrix = new LongMatrix();

        // Test DoubleMatrix
        Double[][] m1Double = new Double[][]{{1.5, 2.5}, {3.5, 4.5}};
        Double[][] m2Double = new Double[][]{{0.5, 0.5}, {0.5, 0.5}};
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1Double, m2Double, doubleMatrix.addMatrix(m1Double, m2Double), '+');

        // Test LongMatrix
        Long[][] m1Long = new Long[][]{{10L, 20L}, {30L, 40L}};
        Long[][] m2Long = new Long[][]{{1L, 2L}, {3L, 4L}};
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1Long, m2Long, longMatrix.multiplyMatrix(m1Long, m2Long), '*');
    }
}