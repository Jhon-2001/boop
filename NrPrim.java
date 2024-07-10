// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NrPrim {

    public static boolean estePrim(int numar) {

        if (numar <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                // Daca numarul este divizibil cu orice numar intre 2 si radacina sa patrata, nu este prim
                return false;
            }
        }
        return true;
    }

    public static boolean EsteSuma(int n) {
        int suma;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (estePrim(i) == true && estePrim(j) == true && (i + j) == n) {
                    System.out.print(i+ " ");

                    System.out.print(j+ " ");

                    return true;

                }
            }
        }return false;
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 20;

        for (int i = n; i < m; i++) {
            System.out.println(i+" ");
            EsteSuma(i+1);
        }
    }
}


