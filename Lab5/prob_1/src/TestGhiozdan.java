import java.util.ArrayList;
import java.util.List;

public class TestGhiozdan {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();

        ghiozdan.add(new Caiet("Caiet1"));
        ghiozdan.add(new Caiet("Caiet2"));
        ghiozdan.add(new Manual("Manual1"));
        ghiozdan.add(new Manual("Manual2"));

        System.out.println("Nr. total de rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Nr. de caiete: " + ghiozdan.getNrCaiete());
        System.out.println("Nr. de manuale: " + ghiozdan.getNrManuale());

        System.out.println("Lista de rechizite:");
        ghiozdan.listItems();

        System.out.println("\nLista de caiete:");
        ghiozdan.listCaiet();

        System.out.println("\nLista de manuale:");
        ghiozdan.listManual();
    }
}
