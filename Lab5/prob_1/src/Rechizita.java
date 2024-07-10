import java.util.ArrayList;
import java.util.List;

abstract class Rechizita {
    protected String eticheta;

    public Rechizita(String eticheta) {
        this.eticheta = eticheta;
    }

    public abstract String getNume();
}

class Manual extends Rechizita {
    public Manual(String eticheta) {
        super(eticheta);
    }

    @Override
    public String getNume() {
        return eticheta + "-Manual";
    }
}

class Caiet extends Rechizita {
    public Caiet(String eticheta) {
        super(eticheta);
    }

    @Override
    public String getNume() {
        return eticheta + "-Caiet";
    }
}