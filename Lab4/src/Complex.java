 public class Complex{
   private double real;
   private double imag;

   public Complex(double real, double imag){
     this.real = real;
     this.imag = imag;
   }
   public Complex add(Complex other){
    return new Complex(this.real + other.real, this.imag + other.imag);
   }

   public Complex substract(Complex other){
    return new Complex(this.real - other.real, this.imag - other.imag);
   }
   public Complex multiply(Complex other){
       double newReal = this.real * other.real - this.imag * other.imag;
       double newImag = this.imag * other.real + this.real * other.imag;
       return new Complex(newReal, newImag);
   }

     @Override
     public String toString() {
         return String.format("%f + %fi", this.real, this.imag);
     }
 }

