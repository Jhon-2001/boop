package Package;

public interface Numeric {
public class Fractie {
    Float numarator, numitor;

    public Fractie(Float numarator, Float numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
    }

    @Override
    public Parent sum(Float numarator, Float numitor) {
        return new Fractie(this.numarator * numitor + this.numitor * numarator, this.numitor * numitor);
    }

    @Override
    public Parent sub(Float numarator, Float numitor) {
        return new Fractie(this.numarator * numitor - this.numitor * numarator, this.numitor * numitor);
    }

    @Override
    public Parent mul(Float numarator, Float numitor) {
        return new Complex(numarator * this.numarator, this.numitor * numitor);
    }
}