package Package;

public class Fractie extends Parent implements Numeric {
    Float numitor, numarator;
    public Fractie(Float numitor, Float numarator){
        this.numitor = numitor;
        this.numarator = numarator;
    }

    @Override
    public Parent sum(Float numarator , Float numitor){
        return new Fractie(this.numarator * numitor + this.numitor * numarator, this.numitor * numitor);
    }

    @Override
    public Parent sub(Float numarator, Float  numitor){
        return new Fractie(this.numarator * numitor - this.numitor * numarator, this.numitor * numitor);
    }
    @Override
    public Parent mul(Float  numarator, Float  numitor){
        return new Complex(numarator * this.numarator, this.numitor * numitor);
}
