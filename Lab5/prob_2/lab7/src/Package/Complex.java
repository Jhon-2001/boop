package Package;

public class Complex extends Parent implements Numeric {
    private Float re, im;

    public Complex(Float re, Float im){
        this.re= re;
        this.im = im;
    }
    @Override
    public Complex sum(Float a , Float  b){
        return new Complex(a +re, b +im);
    }

    @Override
    public Complex sub(Float a, Float  b){
        return new Complex(a-re, b-im);
    }
    @Override
    public Complex mul(Float  a, Float  b){
        return new Complex(this.re*a - this.im*b, this.im*a + this.re*b);
    }
}
