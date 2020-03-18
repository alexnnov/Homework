import java.util.Objects;

public class MyComplex {
    private double real = 0;
    private double imag = 0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "("+real+"+"+imag+"i)";
    }
    public boolean isReal(){
        return real!=0;
    }
    public boolean isImaginary(){
        return imag!=0;
    }
    public boolean equals(double real,double imag){
    return (this.real==real)&&(this.imag==imag);
    }
    public boolean equals(MyComplex another){
        return another.equals(real,imag);
    }
    public double magnitude(){
        return Math.sqrt(real*real+imag*imag);
    }
    public double argument() {
        return Math.atan2(imag, real);
    }
    public MyComplex add(MyComplex right){
        this.real=this.real+right.real;
        this.imag=this.real+right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real+right.real,this.imag+right.imag);
    }
    public MyComplex substract(MyComplex right){
        this.real=this.real-right.real;
        this.imag=this.real-right.imag;
        return this;
    }
    public MyComplex substractNew(MyComplex right){
        return new MyComplex(this.real-right.real,this.imag-right.imag);
    }
    public MyComplex multiply(MyComplex right){
        this.real=this.real*right.real;
        this.imag=this.real*right.imag;
        return this;
    }
    public MyComplex divide(MyComplex right){
        this.real=this.real/right.real;
        this.imag=this.real/right.imag;
        return this;
    }
    public MyComplex conjugate(MyComplex right){
        return new MyComplex(this.real,-this.imag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReal(), getImag());
    }



}
