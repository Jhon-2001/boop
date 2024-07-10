
import java.util.ArrayList;
import java.util.List;
class Ghiozdan {
    private List<Rechizita> rechizite = new ArrayList<>();

    public void add(Caiet caiet) {
        rechizite.add(caiet);
    }

    public void add(Manual manual) {
        rechizite.add(manual);
    }

    public void listItems() {
        for (Rechizita rechizita : rechizite) {
            System.out.println(rechizita.getNume());
        }
    }

    public void listManual() {
        for (Rechizita rechizita : rechizite) {
            if (rechizita instanceof Manual) {
                System.out.println(rechizita.getNume());
            }
        }
    }

    public void listCaiet() {
        for (Rechizita rechizita : rechizite) {
            if (rechizita instanceof Caiet) {
                System.out.println(rechizita.getNume());
            }
        }
    }

    public int getNrRechizite() {
        return rechizite.size();
    }

    public int getNrManuale() {
        int count = 0;
        for (Rechizita rechizita : rechizite) {
            if (rechizita instanceof Manual) {
                count++;
            }
        }
        return count;
    }

    public int getNrCaiete() {
        int count = 0;
        for (Rechizita rechizita : rechizite) {
            if (rechizita instanceof Caiet) {
                count++;
            }
        }
        return count;
    }
}