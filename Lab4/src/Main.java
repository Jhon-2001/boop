public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(1,1);
        System.out.println(a);
        Complex b = new Complex(2,2);
        Complex c = new Complex(2,2);
        Complex d = new Complex(2,2);
        Complex e = new Complex(2,2);
        Complex f = new Complex(2,2);
        Complex g = new Complex(2,2);
        Complex h = new Complex(2,2);
        Complex i = new Complex(2,2);
        Complex [][] mat = new Complex[][]{{a,b,c},{d, e, f},{g, h, i}};
        ComplexMatrix z = new ComplexMatrix(3,3);
        z.Initialize(mat);

        ComplexMatrix z1 = new ComplexMatrix(3,3);
        z1.Initialize(mat);
        ComplexMatrix response = z.add(z1);
        System.out.println(response);

    }
}
