abstract class PiesaSah {
    protected String numePiesa;
    protected int coordX;
    protected int coordY;

    public PiesaSah(String numePiesa, int coordX, int coordY) {
        this.numePiesa = numePiesa;
        this.coordX = coordX;
        this.coordY = coordY;
    }
    public abstract boolean mutaPiesa(int new_coordX, int new_coordY);
}
publci abstract boolean